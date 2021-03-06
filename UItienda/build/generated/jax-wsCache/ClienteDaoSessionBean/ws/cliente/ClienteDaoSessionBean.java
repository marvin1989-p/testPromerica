
package ws.cliente;

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
@WebService(name = "ClienteDaoSessionBean", targetNamespace = "http://dao.model.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClienteDaoSessionBean {


    /**
     * 
     * @return
     *     returns java.util.List<ws.cliente.Cliente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarc", targetNamespace = "http://dao.model.com/", className = "ws.cliente.Listarc")
    @ResponseWrapper(localName = "listarcResponse", targetNamespace = "http://dao.model.com/", className = "ws.cliente.ListarcResponse")
    @Action(input = "http://dao.model.com/ClienteDaoSessionBean/listarcRequest", output = "http://dao.model.com/ClienteDaoSessionBean/listarcResponse")
    public List<Cliente> listarc();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Object
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscar", targetNamespace = "http://dao.model.com/", className = "ws.cliente.Buscar")
    @ResponseWrapper(localName = "buscarResponse", targetNamespace = "http://dao.model.com/", className = "ws.cliente.BuscarResponse")
    @Action(input = "http://dao.model.com/ClienteDaoSessionBean/buscarRequest", output = "http://dao.model.com/ClienteDaoSessionBean/buscarResponse")
    public Object buscar(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "eliminar", targetNamespace = "http://dao.model.com/", className = "ws.cliente.Eliminar")
    @ResponseWrapper(localName = "eliminarResponse", targetNamespace = "http://dao.model.com/", className = "ws.cliente.EliminarResponse")
    @Action(input = "http://dao.model.com/ClienteDaoSessionBean/eliminarRequest", output = "http://dao.model.com/ClienteDaoSessionBean/eliminarResponse")
    public void eliminar(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "crear", targetNamespace = "http://dao.model.com/", className = "ws.cliente.Crear")
    @ResponseWrapper(localName = "crearResponse", targetNamespace = "http://dao.model.com/", className = "ws.cliente.CrearResponse")
    @Action(input = "http://dao.model.com/ClienteDaoSessionBean/crearRequest", output = "http://dao.model.com/ClienteDaoSessionBean/crearResponse")
    public void crear(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "actualizar", targetNamespace = "http://dao.model.com/", className = "ws.cliente.Actualizar")
    @ResponseWrapper(localName = "actualizarResponse", targetNamespace = "http://dao.model.com/", className = "ws.cliente.ActualizarResponse")
    @Action(input = "http://dao.model.com/ClienteDaoSessionBean/actualizarRequest", output = "http://dao.model.com/ClienteDaoSessionBean/actualizarResponse")
    public void actualizar(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0);

}
