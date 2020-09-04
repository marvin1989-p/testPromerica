
package ws.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarResponse_QNAME = new QName("http://dao.model.com/", "buscarResponse");
    private final static QName _ListarcResponse_QNAME = new QName("http://dao.model.com/", "listarcResponse");
    private final static QName _ActualizarResponse_QNAME = new QName("http://dao.model.com/", "actualizarResponse");
    private final static QName _Actualizar_QNAME = new QName("http://dao.model.com/", "actualizar");
    private final static QName _Buscar_QNAME = new QName("http://dao.model.com/", "buscar");
    private final static QName _Eliminar_QNAME = new QName("http://dao.model.com/", "eliminar");
    private final static QName _CrearResponse_QNAME = new QName("http://dao.model.com/", "crearResponse");
    private final static QName _Crear_QNAME = new QName("http://dao.model.com/", "crear");
    private final static QName _EliminarResponse_QNAME = new QName("http://dao.model.com/", "eliminarResponse");
    private final static QName _Listarc_QNAME = new QName("http://dao.model.com/", "listarc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link ListarcResponse }
     * 
     */
    public ListarcResponse createListarcResponse() {
        return new ListarcResponse();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link CrearResponse }
     * 
     */
    public CrearResponse createCrearResponse() {
        return new CrearResponse();
    }

    /**
     * Create an instance of {@link Listarc }
     * 
     */
    public Listarc createListarc() {
        return new Listarc();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link Crear }
     * 
     */
    public Crear createCrear() {
        return new Crear();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "listarcResponse")
    public JAXBElement<ListarcResponse> createListarcResponse(ListarcResponse value) {
        return new JAXBElement<ListarcResponse>(_ListarcResponse_QNAME, ListarcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "actualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "crearResponse")
    public JAXBElement<CrearResponse> createCrearResponse(CrearResponse value) {
        return new JAXBElement<CrearResponse>(_CrearResponse_QNAME, CrearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Crear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "crear")
    public JAXBElement<Crear> createCrear(Crear value) {
        return new JAXBElement<Crear>(_Crear_QNAME, Crear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listarc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.model.com/", name = "listarc")
    public JAXBElement<Listarc> createListarc(Listarc value) {
        return new JAXBElement<Listarc>(_Listarc_QNAME, Listarc.class, null, value);
    }

}
