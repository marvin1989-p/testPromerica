
package ws.orden;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrdenDaoSessionBean", targetNamespace = "http://dao.model.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrdenDaoSessionBean {


    /**
     * 
     * @return
     *     returns java.util.List<ws.orden.Orden>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listaro", targetNamespace = "http://dao.model.com/", className = "ws.orden.Listaro")
    @ResponseWrapper(localName = "listaroResponse", targetNamespace = "http://dao.model.com/", className = "ws.orden.ListaroResponse")
    @Action(input = "http://dao.model.com/OrdenDaoSessionBean/listaroRequest", output = "http://dao.model.com/OrdenDaoSessionBean/listaroResponse")
    public List<Orden> listaro();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Object
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscar", targetNamespace = "http://dao.model.com/", className = "ws.orden.Buscar")
    @ResponseWrapper(localName = "buscarResponse", targetNamespace = "http://dao.model.com/", className = "ws.orden.BuscarResponse")
    @Action(input = "http://dao.model.com/OrdenDaoSessionBean/buscarRequest", output = "http://dao.model.com/OrdenDaoSessionBean/buscarResponse")
    public Object buscar(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "eliminar", targetNamespace = "http://dao.model.com/", className = "ws.orden.Eliminar")
    @ResponseWrapper(localName = "eliminarResponse", targetNamespace = "http://dao.model.com/", className = "ws.orden.EliminarResponse")
    @Action(input = "http://dao.model.com/OrdenDaoSessionBean/eliminarRequest", output = "http://dao.model.com/OrdenDaoSessionBean/eliminarResponse")
    public void eliminar(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "crear", targetNamespace = "http://dao.model.com/", className = "ws.orden.Crear")
    @ResponseWrapper(localName = "crearResponse", targetNamespace = "http://dao.model.com/", className = "ws.orden.CrearResponse")
    @Action(input = "http://dao.model.com/OrdenDaoSessionBean/crearRequest", output = "http://dao.model.com/OrdenDaoSessionBean/crearResponse")
    public void crear(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "actualizar", targetNamespace = "http://dao.model.com/", className = "ws.orden.Actualizar")
    @ResponseWrapper(localName = "actualizarResponse", targetNamespace = "http://dao.model.com/", className = "ws.orden.ActualizarResponse")
    @Action(input = "http://dao.model.com/OrdenDaoSessionBean/actualizarRequest", output = "http://dao.model.com/OrdenDaoSessionBean/actualizarResponse")
    public void actualizar(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

}
