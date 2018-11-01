

Application that as used as sample back end to WSO 2. Integrator API, and Proxy.
This is Spring Boot Application that can be used as executable jar.
The Application converts miles to kilometers and kilometers to miles;

The application can be called on

http://localhost:8080/ws

Example calls:

<?xml version="1.0"?>
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns2="http://spring.io/guides/gs-producing-web-service">
<SOAP-ENV:Header/>
<SOAP-ENV:Body>
    <ns2:distanceInKmRequest>
            <distanceInMiles>1500.0</distanceInMiles>
    </ns2:distanceInKmRequest>
</SOAP-ENV:Body>
</SOAP-ENV:Envelope>

<?xml version="1.0"?>
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns2="http://spring.io/guides/gs-producing-web-service">
<SOAP-ENV:Header/>
<SOAP-ENV:Body>
    <ns2:distanceInMilesRequest>
            <distanceInKm>10</distanceInKm>
    </ns2:distanceInMilesRequest>
</SOAP-ENV:Body>
</SOAP-ENV:Envelope>

