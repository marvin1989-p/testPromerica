
package ws.producto;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductoWS", targetNamespace = "http://dao.model.com/", wsdlLocation = "http://localhost:8080/ProductoWS/ProductoDaoSessionBean?WSDL")
public class ProductoWS
    extends Service
{

    private final static URL PRODUCTOWS_WSDL_LOCATION;
    private final static WebServiceException PRODUCTOWS_EXCEPTION;
    private final static QName PRODUCTOWS_QNAME = new QName("http://dao.model.com/", "ProductoWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProductoWS/ProductoDaoSessionBean?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTOWS_WSDL_LOCATION = url;
        PRODUCTOWS_EXCEPTION = e;
    }

    public ProductoWS() {
        super(__getWsdlLocation(), PRODUCTOWS_QNAME);
    }

    public ProductoWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTOWS_QNAME, features);
    }

    public ProductoWS(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTOWS_QNAME);
    }

    public ProductoWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTOWS_QNAME, features);
    }

    public ProductoWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductoWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductoDaoSessionBean
     */
    @WebEndpoint(name = "ProductoDaoSessionBeanPort")
    public ProductoDaoSessionBean getProductoDaoSessionBeanPort() {
        return super.getPort(new QName("http://dao.model.com/", "ProductoDaoSessionBeanPort"), ProductoDaoSessionBean.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductoDaoSessionBean
     */
    @WebEndpoint(name = "ProductoDaoSessionBeanPort")
    public ProductoDaoSessionBean getProductoDaoSessionBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dao.model.com/", "ProductoDaoSessionBeanPort"), ProductoDaoSessionBean.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTOWS_EXCEPTION!= null) {
            throw PRODUCTOWS_EXCEPTION;
        }
        return PRODUCTOWS_WSDL_LOCATION;
    }

}