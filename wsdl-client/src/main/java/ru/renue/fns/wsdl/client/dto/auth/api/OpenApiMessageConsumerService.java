
package ru.renue.fns.wsdl.client.dto.auth.api;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OpenApiMessageConsumerService", targetNamespace = "urn://x-artefacts-gnivc-ru/inplat/servin/OpenApiMessageConsumerService/1.0", wsdlLocation = "https://openapi.nalog.ru:8090/open-api/AuthService/0.1?wsdl")
public class OpenApiMessageConsumerService
    extends Service
{

    private final static URL OPENAPIMESSAGECONSUMERSERVICE_WSDL_LOCATION;
    private final static WebServiceException OPENAPIMESSAGECONSUMERSERVICE_EXCEPTION;
    private final static QName OPENAPIMESSAGECONSUMERSERVICE_QNAME = new QName("urn://x-artefacts-gnivc-ru/inplat/servin/OpenApiMessageConsumerService/1.0", "OpenApiMessageConsumerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://openapi.nalog.ru:8090/open-api/AuthService/0.1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPENAPIMESSAGECONSUMERSERVICE_WSDL_LOCATION = url;
        OPENAPIMESSAGECONSUMERSERVICE_EXCEPTION = e;
    }

    public OpenApiMessageConsumerService() {
        super(__getWsdlLocation(), OPENAPIMESSAGECONSUMERSERVICE_QNAME);
    }

    public OpenApiMessageConsumerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPENAPIMESSAGECONSUMERSERVICE_QNAME, features);
    }

    public OpenApiMessageConsumerService(URL wsdlLocation) {
        super(wsdlLocation, OPENAPIMESSAGECONSUMERSERVICE_QNAME);
    }

    public OpenApiMessageConsumerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPENAPIMESSAGECONSUMERSERVICE_QNAME, features);
    }

    public OpenApiMessageConsumerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OpenApiMessageConsumerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OpenApiMessageConsumerServicePortType
     */
    @WebEndpoint(name = "OpenApiMessageConsumerServiceEndpoint")
    public OpenApiMessageConsumerServicePortType getOpenApiMessageConsumerServiceEndpoint() {
        return super.getPort(new QName("urn://x-artefacts-gnivc-ru/inplat/servin/OpenApiMessageConsumerService/1.0", "OpenApiMessageConsumerServiceEndpoint"), OpenApiMessageConsumerServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OpenApiMessageConsumerServicePortType
     */
    @WebEndpoint(name = "OpenApiMessageConsumerServiceEndpoint")
    public OpenApiMessageConsumerServicePortType getOpenApiMessageConsumerServiceEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("urn://x-artefacts-gnivc-ru/inplat/servin/OpenApiMessageConsumerService/1.0", "OpenApiMessageConsumerServiceEndpoint"), OpenApiMessageConsumerServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPENAPIMESSAGECONSUMERSERVICE_EXCEPTION!= null) {
            throw OPENAPIMESSAGECONSUMERSERVICE_EXCEPTION;
        }
        return OPENAPIMESSAGECONSUMERSERVICE_WSDL_LOCATION;
    }

}
