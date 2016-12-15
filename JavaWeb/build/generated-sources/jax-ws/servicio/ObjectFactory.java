
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://servicio/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://servicio/", "hello");
    private final static QName _EdadResponse_QNAME = new QName("http://servicio/", "edadResponse");
    private final static QName _Edad_QNAME = new QName("http://servicio/", "edad");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Edad }
     * 
     */
    public Edad createEdad() {
        return new Edad();
    }

    /**
     * Create an instance of {@link EdadResponse }
     * 
     */
    public EdadResponse createEdadResponse() {
        return new EdadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "edadResponse")
    public JAXBElement<EdadResponse> createEdadResponse(EdadResponse value) {
        return new JAXBElement<EdadResponse>(_EdadResponse_QNAME, EdadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "edad")
    public JAXBElement<Edad> createEdad(Edad value) {
        return new JAXBElement<Edad>(_Edad_QNAME, Edad.class, null, value);
    }

}
