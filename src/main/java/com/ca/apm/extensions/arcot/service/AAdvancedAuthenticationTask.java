package com.ca.apm.extensions.arcot.service;

import com.ca.apm.extensions.base.service.IConstants;
import com.ca.apm.extensions.im.service.ImService;
import com.ca.apm.extensions.utils.ExtensionUtils;
import com.google.common.base.Throwables;
import com.wily.introscope.agent.IAgent;
import com.wily.util.feedback.IModuleFeedbackChannel;
import com.wily.util.heartbeat.ITimestampedRunnable;
import org.apache.axis.AxisFault;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Perform an Advanced Authentication API request.
 */
public abstract class AAdvancedAuthenticationTask implements ITimestampedRunnable, IConstants {
    public static final String kAdvancedAuthenticationMetricPrefix = "CA Advanced Authentication";
    public static final String kLastCompletedMetricPostfix = COLON + "Last Completed";
    public static final String kDurationMetricPostfix =  COLON + "Duration";
    public static final String kStatusMessageMetricPostfix =  COLON + "Status Message";
    public static final String kErrorCodeMetricPostfix =  COLON + "Error Code";
    public static final String kStatusMetricPostfix =  COLON + "Status";
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
    protected ArcotService service;
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
     * @param service the service
     */
    public AAdvancedAuthenticationTask(IAgent agent,
                                       IModuleFeedbackChannel log,
                                       ArcotService service) {
        this.agent = agent;
        this.log = log;
        this.service = service;
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
    public abstract Status makeRequest() throws RemoteException;

    @Override
    public void ITimestampedRunnable_execute(long arg0) {

        final long startTime = System.currentTimeMillis();

        try {

            log.debug("running task " + getTaskName());

            // make the custom request
            Status status = makeRequest();
            final long completedTime = System.currentTimeMillis();

            if (null != status) {
                // send the status metrics
                sendStatus(getTaskName() + PIPE + kRequest,
                        STATUS_OK,
                        status.getErrorCode(),
                        status.getMessage(),
                        startTime,
                        completedTime);

                // print the transaction id
                log.debug("transaction id = " + status.getTransactionId());

            } else {
                // we didn't get a status, should never come here
                sendStatus(getTaskName() + PIPE + kRequest,
                        STATUS_DANGER,
                        1,
                        getTaskName() + " request did not return a status",
                        startTime,
                        completedTime);
            }

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
                    System.currentTimeMillis());

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
                    System.currentTimeMillis());

        } catch (Exception e) {

            log.warn("Error in " + getTaskName() + " request: " + e);
            if (log.isDebugEnabled()) {
                log.debug(getTaskName() + ": "
                        + Throwables.getStackTraceAsString(e));
            }
        } finally {

            // count the request as sustainablity metric
            service.addSustainablityMetric(kAdvancedAuthenticationMetricPrefix + PIPE
                            + getTaskName() + COLON + "Request",
                    1,
                    MetricType.PERINTERVAL,
                    System.currentTimeMillis());
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
     */
    public void sendStatus(String metricPath,
                           int status,
                           int errorCode,
                           String statusMessage,
                           long startTime,
                           String completedTimeString) {
        // convert completed time
        long completedTime = getTimestampFromString(completedTimeString, defaultDateFormat);

        // if conversion error fall back to currentTime
        if (-1 == completedTime) {
            completedTime = System.currentTimeMillis();
        }

        sendStatus(metricPath, status, errorCode, statusMessage, startTime, completedTime);
    }

    /**
     * Send status metrics.
     * @param metricPath the metric path
     * @param status the status (use IConstants!)
     * @param errorCode the errorCode, 0 for no error
     * @param statusMessage the status message, may be null
     * @param startTime the request start time, leave 0 if you don't want to send duration
     * @param completedTime the request completed time
     */
    public void sendStatus(String metricPath,
                           int status,
                           int errorCode,
                           String statusMessage,
                           long startTime,
                           long completedTime) {

        final long currentTime = System.currentTimeMillis();

        service.addMetric(kAdvancedAuthenticationMetricPrefix,
                metricPath + kStatusMetricPostfix,
                status,
                MetricType.NUMERIC,
                currentTime);

        service.addMetric(kAdvancedAuthenticationMetricPrefix,
                metricPath + kErrorCodeMetricPostfix,
                errorCode,
                MetricType.NUMERIC,
                currentTime);

        if (null != statusMessage) {
            service.addMetric(kAdvancedAuthenticationMetricPrefix,
                    metricPath + kStatusMessageMetricPostfix,
                    statusMessage,
                    MetricType.STRING,
                    currentTime);
        }

        // only send duration if we have a start time
        if (0 < startTime) {
            final long duration = completedTime - startTime;
            service.addMetric(kAdvancedAuthenticationMetricPrefix,
                    metricPath + kDurationMetricPostfix,
                    duration,
                    MetricType.AVERAGE,
                    currentTime);
        }

        service.addMetric(kAdvancedAuthenticationMetricPrefix,
                metricPath + kLastCompletedMetricPostfix,
                defaultDateFormat.format(new Date(completedTime)),
                MetricType.STRING,
                currentTime);
    }

    /**
     * Status of a request.
     */
    public class Status {
        int status;
        int errorCode;
        String message;
        String transactionId;

        /**
         * Create a new request status.
         * @param status The status. Use IConstants.Status.
         * @param errorCode the error code
         * @param message a status or error message
         * @param transactionId a transaction id (may be null)
         */
        public Status(int status, int errorCode, String message, String transactionId) {
            this.status = status;
            this.errorCode = errorCode;
            this.message = message;
            this.transactionId = transactionId;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }
    }
}
