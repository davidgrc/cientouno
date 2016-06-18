
package es.panel.cientouno.wsclient.agenciatributaria;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrpfType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IrpfType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ejercicio" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RendimientoTrabajo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RendimientoCapitalMobiliario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RendimientoCapitalInmobiliario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ResultadoDeclaracion" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrpfType", propOrder = {
    "documento",
    "ejercicio",
    "rendimientoTrabajo",
    "rendimientoCapitalMobiliario",
    "rendimientoCapitalInmobiliario",
    "resultadoDeclaracion"
})
public class IrpfType {

    @XmlElement(name = "Documento", required = true)
    protected String documento;
    @XmlElement(name = "Ejercicio", required = true)
    protected BigInteger ejercicio;
    @XmlElement(name = "RendimientoTrabajo")
    protected double rendimientoTrabajo;
    @XmlElement(name = "RendimientoCapitalMobiliario")
    protected double rendimientoCapitalMobiliario;
    @XmlElement(name = "RendimientoCapitalInmobiliario")
    protected double rendimientoCapitalInmobiliario;
    @XmlElement(name = "ResultadoDeclaracion")
    protected double resultadoDeclaracion;

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
     * Obtiene el valor de la propiedad ejercicio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEjercicio() {
        return ejercicio;
    }

    /**
     * Define el valor de la propiedad ejercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEjercicio(BigInteger value) {
        this.ejercicio = value;
    }

    /**
     * Obtiene el valor de la propiedad rendimientoTrabajo.
     * 
     */
    public double getRendimientoTrabajo() {
        return rendimientoTrabajo;
    }

    /**
     * Define el valor de la propiedad rendimientoTrabajo.
     * 
     */
    public void setRendimientoTrabajo(double value) {
        this.rendimientoTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad rendimientoCapitalMobiliario.
     * 
     */
    public double getRendimientoCapitalMobiliario() {
        return rendimientoCapitalMobiliario;
    }

    /**
     * Define el valor de la propiedad rendimientoCapitalMobiliario.
     * 
     */
    public void setRendimientoCapitalMobiliario(double value) {
        this.rendimientoCapitalMobiliario = value;
    }

    /**
     * Obtiene el valor de la propiedad rendimientoCapitalInmobiliario.
     * 
     */
    public double getRendimientoCapitalInmobiliario() {
        return rendimientoCapitalInmobiliario;
    }

    /**
     * Define el valor de la propiedad rendimientoCapitalInmobiliario.
     * 
     */
    public void setRendimientoCapitalInmobiliario(double value) {
        this.rendimientoCapitalInmobiliario = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoDeclaracion.
     * 
     */
    public double getResultadoDeclaracion() {
        return resultadoDeclaracion;
    }

    /**
     * Define el valor de la propiedad resultadoDeclaracion.
     * 
     */
    public void setResultadoDeclaracion(double value) {
        this.resultadoDeclaracion = value;
    }

}
