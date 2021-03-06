
package es.panel.cientouno.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutorizaConsultaPadron" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AutorizaConsultaAgenciaTributaria" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documento",
    "nombre",
    "primerApellido",
    "segundoApellido",
    "autorizaConsultaPadron",
    "autorizaConsultaAgenciaTributaria"
})
@XmlRootElement(name = "Cientouno")
public class Cientouno {

    @XmlElement(name = "Documento", required = true)
    protected String documento;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "PrimerApellido", required = true)
    protected String primerApellido;
    @XmlElement(name = "SegundoApellido")
    protected String segundoApellido;
    @XmlElement(name = "AutorizaConsultaPadron")
    protected boolean autorizaConsultaPadron;
    @XmlElement(name = "AutorizaConsultaAgenciaTributaria")
    protected boolean autorizaConsultaAgenciaTributaria;
    @XmlAttribute(name = "TimeStamp")
    protected String timeStamp;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizaConsultaPadron.
     * 
     */
    public boolean isAutorizaConsultaPadron() {
        return autorizaConsultaPadron;
    }

    /**
     * Define el valor de la propiedad autorizaConsultaPadron.
     * 
     */
    public void setAutorizaConsultaPadron(boolean value) {
        this.autorizaConsultaPadron = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizaConsultaAgenciaTributaria.
     * 
     */
    public boolean isAutorizaConsultaAgenciaTributaria() {
        return autorizaConsultaAgenciaTributaria;
    }

    /**
     * Define el valor de la propiedad autorizaConsultaAgenciaTributaria.
     * 
     */
    public void setAutorizaConsultaAgenciaTributaria(boolean value) {
        this.autorizaConsultaAgenciaTributaria = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define el valor de la propiedad timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad echoToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Define el valor de la propiedad echoToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

}
