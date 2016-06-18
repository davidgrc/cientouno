
package es.panel.cientouno.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.panel.cientouno.service package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.panel.cientouno.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cientouno }
     * 
     */
    public Cientouno createCientouno() {
        return new Cientouno();
    }

    /**
     * Create an instance of {@link CientounoResponse }
     * 
     */
    public CientounoResponse createCientounoResponse() {
        return new CientounoResponse();
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
     * Create an instance of {@link ResguardoType }
     * 
     */
    public ResguardoType createResguardoType() {
        return new ResguardoType();
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
