package com.ca.apm.extensions.im.service;

import com.ca.apm.extensions.base.service.IConstants;
import com.ca.apm.extensions.utils.ExtensionUtils;
import com.google.common.base.Throwables;
import com.wily.introscope.agent.IAgent;
import com.wily.util.feedback.IModuleFeedbackChannel;
import com.wily.util.heartbeat.ITimestampedRunnable;
import org.apache.axis.AxisFault;
import tews6.wsdl.ImsException;
import tews6.wsdl.ImsStatus;
import tews6.wsdl.TaskStatusQueryResult;
import tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetails;
import tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails;
import tews6.wsdl.TaskStatusSearchFilter;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Perform an  Identity Manager API request.
 */
public abstract class AIdentityManagerTask implements ITimestampedRunnable, IConstants {
    public static final String kIdentityManagerMetricPrefix = "CA Identity Manager";
    public static final String kLastCompletedMetricPostfix = COLON + "Last Completed";
    public static final String kDurationMetricPostfix =  COLON + "Duration";
    public static final String kStatusMessageMetricPostfix =  COLON + "Status Message";
    public static final String kErrorCodeMetricPostfix =  COLON + "Error Code";
    public static final String kStatusMetricPostfix =  COLON + "Status";
    public static final String kTransactionIdMetricPostfix =  COLON + "Last Transaction Id";
    public static final String kRequest =  "Request";
    public static final String kCompleted = "completed";

    public static final String kConnectException = "ConnectException";

    public static final long kDefaultPauseBeforeCheck = 5000;

    public static SimpleDateFormat defaultDateFormat =
            new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    @SuppressWarnings("unused")
    protected IAgent agent;
    @SuppressWarnings("unused")
    protected IModuleFeedbackChannel log;
    protected ImService service;
    private long pauseBeforeCheck = kDefaultPauseBeforeCheck;

    /**
     * How long to wait before checking the task status.
     * @return the pause in milliseconds
     */
    public long getPauseBeforeCheck() {
        return pauseBeforeCheck;
    }

    /**
     * Set how long to wait before checking the task status.
     * @param pauseBeforeCheck the pause in milliseconds
     */
    public void setPauseBeforeCheck(long pauseBeforeCheck) {
        this.pauseBeforeCheck = pauseBeforeCheck;
    }

    /**
     * Create a new Identity Manager task.
     * @param agent the agent
     * @param log the logger
     * @param imService the service
     */
    public AIdentityManagerTask(IAgent agent, IModuleFeedbackChannel log, ImService imService) {
        this.agent = agent;
        this.log = log;
        this.service = imService;
    }

    /**
     * Get the task name for metric names, logging, etc.
     * @return the task name
     */
    public abstract String getTaskName();

    /**
     * Make the API request to Identity Manager.
     * Status metrics are created from the returned status.
     * @return the status returned from the request
     */
    public abstract ImsStatus makeRequest() throws RemoteException, ImsException;

    @Override
    public void ITimestampedRunnable_execute(long arg0) {

        final long startTime = System.currentTimeMillis();

        try {

            log.debug("running task " + getTaskName());

            // make the custom request
            final ImsStatus status = makeRequest();
            final long completedTime = System.currentTimeMillis();

            log.debug("task " + getTaskName() + " returned " + status);

            if (null != status) {
                // check info messages
                String message = kCompleted;
                String[] messages = status.getInfoMessage();
                if (null != messages && messages.length > 0) {
                    StringBuilder builder = new StringBuilder();
                    for (String s : messages) {
                        builder.append(s).append(", ");
                    }
                    // remove last ", "
                    message = builder.substring(0, builder.length() - 2);
                }

                // send the status metrics
                sendStatus(getTaskName() + PIPE + kRequest,
                        STATUS_OK,
                        0,
                        message,
                        startTime,
                        completedTime,
                        status.getTransactionId());

                // print the transaction id
                log.debug("transaction id = " + status.getTransactionId());

                // wait for the tasks to finish
                Thread.sleep(getPauseBeforeCheck());

                // check the transaction status
                checkTransactionStatus(status.getTransactionId());

            } else {
                // we didn't get a status, should never come here
                sendStatus(getTaskName() + PIPE + kRequest,
                        STATUS_DANGER,
                        1,
                        getTaskName() + " request did not return a status",
                        startTime,
                        completedTime,
                        null);
            }

        } catch (ImsException ex) {

            // error from TEWS/Identity Manager
            log.debug("ImsException in " + getTaskName() + " request: " + ex);

            sendStatus(getTaskName() + PIPE + kRequest,
                    STATUS_WARN,
                    Integer.parseInt(ex.getException().getCode()),
                    ex.getException().getDescription(),
                    startTime,
                    System.currentTimeMillis(),
                    null);

        } catch (AxisFault ex) {
            log.warn("AxisFault in " + getTaskName() + " request: " + ex);
            log.debug("  faultCode: " + ex.getFaultCode()
                    + ", faultstring: " + ex.getFaultString() + ";\n  " + ex.dumpToString());

            int status = STATUS_WARN; // minor error
            String message = ex.getFaultString();
            // connection error => DANGER
            if (ex.getFaultString().contains(kConnectException)) {
                status = STATUS_DANGER;
                message = "Cannot connect to "
                        + ExtensionUtils.formatToBeResourceSafe(
                                service.getProperty(ImService.kImUrl));
            }

            sendStatus(getTaskName() + PIPE + kRequest,
                    status,
                    1,
                    message,
                    startTime,
                    System.currentTimeMillis(),
                    null);

        } catch (RemoteException ex) {

            try {
                log.error("RemoteException in " + getTaskName() + " request: " + ex);

                if (log.isDebugEnabled()) {
                    log.debug(getTaskName() + ": "
                            + Throwables.getStackTraceAsString(ex));

                    Throwable throwable = ex.getCause();
                    while (null != throwable) {
                        log.debug("  cause Exception: " + throwable);
                        log.debug(getTaskName() + ": "
                                + Throwables.getStackTraceAsString(throwable));
                        throwable = throwable.getCause();
                    }
                }
            } catch (Exception e) {
                log.error("error in " + getTaskName() + ":" + e.getMessage());
                log.debug("error in " + getTaskName() + ": " + e);
            }

            sendStatus(getTaskName() + PIPE + kRequest,
                    STATUS_DANGER,
                    1,
                    null != ex.getMessage() ? ex.getMessage() : ex.toString(),
                    startTime,
                    System.currentTimeMillis(),
                    null);

        } catch (InterruptedException e) {

            log.warn("Error in " + getTaskName() + " request: " + e);

        } catch (Exception e) {

            log.warn("Error in " + getTaskName() + " request: " + e);
            if (log.isDebugEnabled()) {
                log.debug(getTaskName() + ": "
                        + Throwables.getStackTraceAsString(e));
            }
        } finally {

            // count the request as sustainablity metric
            service.addSustainablityMetric(kIdentityManagerMetricPrefix + PIPE
                            + getTaskName() + COLON + "Request",
                    1,
                    MetricType.PERINTERVAL,
                    System.currentTimeMillis());
        }
    }

    /**
     * Check the transaction status and create metrics.
     * @param transactionId the transaction id
     */
    protected void checkTransactionStatus(String transactionId) {

        try {
            // create the task status search filter from the transaction id
            TaskStatusSearchFilter filter = new TaskStatusSearchFilter();
            filter.setTaskId(transactionId);
            TaskStatusSearchFilter[] filterArray = {filter};

            // execute the request with same task context
            final TaskStatusQueryResult result =
                    service.getSoapService().taskStatusQuery(service.getTaskContext(), filterArray);

            // now iterate through the result
            for (int i = 0; i < result.getResultItem().length; ++i) {
                // get a single result item
                TaskStatusQueryResultResultItemImsTaskDetails item = result.getResultItem()[i];

                // send the result metrics
                int state = STATUS_WARN;
                int errorCode = 1;
                if (item.getState().toLowerCase().equals(kCompleted)) {
                    state = STATUS_OK;
                    errorCode = 0;
                }

                sendStatus(item.getName() + PIPE + "Task",
                        state,
                        errorCode,
                        item.getState(),
                        0,
                        item.getCompletedTime(),
                        item.getId());

                log.debug(item.getName() + " (" + item.getId() + "): " + item.getState()
                        + " at " + item.getCompletedTime());

                // now iterate through the event details
                for (int j = 0; j < result.getResultItem()[i].getEventDetails().length; ++j) {
                    // get a single event detail
                    TaskStatusQueryResultResultItemImsTaskDetailsEventDetails detail =
                            item.getEventDetails()[j];

                    // check state
                    if (detail.getState().toLowerCase().equals(kCompleted)) {
                        state = STATUS_OK;
                        errorCode = 0;
                    } else {
                        state = STATUS_WARN;
                        errorCode = 1;
                    }

                    // send the event detail
                    // sending a start time does not make much sense,
                    // completed time is coming from another server that need not be time synced
                    // sendStatus(item.getName() + PIPE + (j + 1) + " " + detail.getName(),
                    sendStatus(item.getName() + PIPE + detail.getName(),
                            state,
                            errorCode,
                            detail.getState(),
                            0,
                            detail.getCompletedTime(),
                            detail.getId());

                    log.debug("  " + detail.getName() + " (" + detail.getId() + "): "
                            + detail.getState() + " at " + detail.getCompletedTime());
                }
            }
        } catch (ImsException ex) {

            log.debug("ImsException in " + getTaskName() + " request: " + ex);

            sendStatus(getTaskName() + PIPE + kRequest,
                    STATUS_WARN,
                    Integer.parseInt(ex.getException().getCode()),
                    ex.getException().getDescription(),
                    0,
                    System.currentTimeMillis(),
                    null);

        } catch (AxisFault ex) {
            log.warn("AxisFault in " + getTaskName() + " request: " + ex);
            log.debug("  faultCode: " + ex.getFaultCode()
                    + ", faultstring: " + ex.getFaultString() + "; " + ex.dumpToString());

            sendStatus(getTaskName() + PIPE + kRequest,
                    STATUS_WARN,
                    1,
                    ex.getFaultString(),
                    0,
                    System.currentTimeMillis(),
                    null);

        } catch (java.rmi.RemoteException ex) {

            try {
                log.error("RemoteException in " + getTaskName() + " request: " + ex);
                log.debug(getTaskName() + ": " + Throwables.getStackTraceAsString(ex));

                Throwable throwable = ex.getCause();
                while (null != throwable) {
                    log.error("  cause Exception: " + throwable);
                    log.debug(getTaskName() + ": " + Throwables.getStackTraceAsString(throwable));
                    throwable = throwable.getCause();
                }
            } catch (Exception e) {
                log.error("error in " + getTaskName() + ":" + e.getMessage());
                log.debug("error in " + getTaskName() + ": " + e);
            }

            sendStatus(getTaskName() + PIPE + kRequest,
                    STATUS_DANGER,
                    1,
                    null != ex.getMessage() ? ex.getMessage() : ex.toString(),
                    0,
                    System.currentTimeMillis(),
                    null);
        }
    }

    /**
     * Get the timestmap from a date string.
     * @param dateString the date string
     * @param dateFormat the date format
     * @return the timestamp or -1 if there is a parse error
     */
    public static long getTimestampFromString(String dateString, DateFormat dateFormat) {
        try {
            Date parsedDate = dateFormat.parse(dateString);
            return parsedDate.getTime();
        } catch (ParseException e) {
            return -1;
        }
    }

    /**
     * Send status metrics.
     * @param metricPath the metric path
     * @param status the status (use IConstants!)
     * @param errorCode the errorCode, 0 for no error
     * @param statusMessage the status message, may be null
     * @param startTime the request start time
     * @param completedTimeString the request completed time
     * @param lastTransactionId the id of the last transaction
     */
    public void sendStatus(String metricPath,
                           int status,
                           int errorCode,
                           String statusMessage,
                           long startTime,
                           String completedTimeString,
                           String lastTransactionId) {
        // convert completed time
        long completedTime = getTimestampFromString(completedTimeString, defaultDateFormat);

        // if conversion error fall back to currentTime
        if (-1 == completedTime) {
            completedTime = System.currentTimeMillis();
        }

        sendStatus(metricPath, status, errorCode, statusMessage, startTime, completedTime,
                lastTransactionId);
    }

    /**
     * Send status metrics.
     * @param metricPath the metric path
     * @param status the status (use IConstants!)
     * @param errorCode the errorCode, 0 for no error
     * @param statusMessage the status message, may be null
     * @param startTime the request start time, leave 0 if you don't want to send duration
     * @param completedTime the request completed time
     * @param lastTransactionId the id of the last transaction
     */
    public void sendStatus(String metricPath,
                           int status,
                           int errorCode,
                           String statusMessage,
                           long startTime,
                           long completedTime,
                           String lastTransactionId) {

        final long currentTime = System.currentTimeMillis();

        service.addMetric(kIdentityManagerMetricPrefix,
                metricPath + kStatusMetricPostfix,
                status,
                IConstants.MetricType.NUMERIC,
                currentTime);

        service.addMetric(kIdentityManagerMetricPrefix,
                metricPath + kErrorCodeMetricPostfix,
                errorCode,
                IConstants.MetricType.NUMERIC,
                currentTime);

        if (null != statusMessage) {
            service.addMetric(kIdentityManagerMetricPrefix,
                    metricPath + kStatusMessageMetricPostfix,
                    statusMessage,
                    IConstants.MetricType.STRING,
                    currentTime);
        }

        // only send duration if we have a start time
        if (0 < startTime) {
            final long duration = completedTime - startTime;
            service.addMetric(kIdentityManagerMetricPrefix,
                    metricPath + kDurationMetricPostfix,
                    duration,
                    IConstants.MetricType.AVERAGE,
                    currentTime);
        }

        service.addMetric(kIdentityManagerMetricPrefix,
                metricPath + kLastCompletedMetricPostfix,
                defaultDateFormat.format(new Date(completedTime)),
                IConstants.MetricType.STRING,
                currentTime);

        if (null != lastTransactionId) {
            service.addMetric(kIdentityManagerMetricPrefix,
                    metricPath + kTransactionIdMetricPostfix,
                    lastTransactionId,
                    MetricType.STRING,
                    currentTime);
        }
    }
}
