var http = require("http");

http.createServer(function (request, response) {
    // Send the HTTP header
    // HTTP Status: 200 : OK
    // Content Type: text/plain
    response.writeHead(200, {'Content-Type': 'text/xml'});

    console.log('responding to request');

    // Send the response body as "Hello World"
    response.end('<?xml version="1.0" encoding="UTF-8"?>\n' +
        '<soapenv:Envelope\n' +
        '  xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"\n' +
        '  xmlns:tews="http://tews6/wsdl"\n' +
        '  xmlns:xsd="http://www.w3.org/2001/XMLSchema"\n' +
        '  xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/"\n' +
        '  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"\n' +
        '  xsi:schemaLocation="http://schemas.xmlsoap.org/soap/envelope/ http://schemas.xmlsoap.org/soap/envelope/">\n' +
        '  <soapenv:Body>\n' +
        '    <soapenv:Fault>\n' +
        '      <faultcode>soapenv:Server</faultcode>\n' +
        '      <faultstring>Unknown processing error.</faultstring>\n' +
        '      <faultactor>http://tews6/wsdl</faultactor>\n' +
        '      <detail>\n' +
        '        <tews:ImsException version="6.0">\n' +
        '          <tews:exception>\n' +
        '            <tews:name>com.netegrity.ims.exception.IMSException</tews:name>\n' +
        '            <tews:code>700</tews:code>\n' +
        '            <tews:description>\n' +
        '              <![CDATA[Unable to copy object, object could not be found. key: Subject.UID value: dummyUser.\n' +
        ']]>\n' +
        '            </tews:description>\n' +
        //'            <tews:description>test</tews:description>\n' +
        '            <tews:transaction>19380c78-2635f2b0-6e1e04e0-88da723</tews:transaction>\n' +
        '          </tews:exception>\n' +
        '        </tews:ImsException>\n' +
        '      </detail>\n' +
        '    </soapenv:Fault>\n' +
        '  </soapenv:Body>\n' +
        '</soapenv:Envelope>');
}).listen(8081);

// Console will print the message
console.log('Server running at http://127.0.0.1:8081/');