
package es.panel.cientouno.manager.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


public class SolicitudTipoCientouno {

    private String documento;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private boolean autorizaConsultaPadron;
    private boolean autorizaConsultaAgenciaTributaria;
    private String echoToken;

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
