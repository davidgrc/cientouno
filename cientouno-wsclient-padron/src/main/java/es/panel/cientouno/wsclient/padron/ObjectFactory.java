
package es.panel.cientouno.wsclient.padron;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.panel.cientouno.wsclient.padron package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.panel.cientouno.wsclient.padron
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPadron }
     * 
     */
    public ConsultaPadron createConsultaPadron() {
        return new ConsultaPadron();
    }

    /**
     * Create an instance of {@link ConsultaPadronResponse }
     * 
     */
    public ConsultaPadronResponse createConsultaPadronResponse() {
        return new ConsultaPadronResponse();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link DomicilioType }
     * 
     */
    public DomicilioType createDomicilioType() {
        return new DomicilioType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

}
