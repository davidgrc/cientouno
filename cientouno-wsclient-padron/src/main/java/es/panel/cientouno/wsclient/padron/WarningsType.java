
package es.panel.cientouno.wsclient.padron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WarningsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WarningsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://www.example.org/PadronService/}WarningType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarningsType", propOrder = {
    "warning"
})
public class WarningsType {

    @XmlElement(name = "Warning", required = true)
    protected WarningType warning;

    /**
     * Obtiene el valor de la propiedad warning.
     * 
     * @return
     *     possible object is
     *     {@link WarningType }
     *     
     */
    public WarningType getWarning() {
        return warning;
    }

    /**
     * Define el valor de la propiedad warning.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningType }
     *     
     */
    public void setWarning(WarningType value) {
        this.warning = value;
    }

}
