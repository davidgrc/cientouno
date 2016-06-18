/*
* File: ResguardoTipoCientouno.java
* Author: david.garcia
* Date: 26/4/2016
*/
package es.panel.cientouno.manager.model;


/**
 * Description: Resguardo del expediente de la solicitud cientouno
 *
 * @date 26/4/2016
 * @author david.garcia
 *
 */
public class ResguardoTipoCientouno {
	
    private String numeroRegistro;
    private Resultado resultado;
    private String informacionAdicional;
    
    
	/**
	 * getNumeroRegistro
	 *
	 * @return the numeroRegistro
	 */
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	/**
	 * setNumeroRegistro
	 *
	 * @param numeroRegistro the numeroRegistro to set
	 */
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	/**
	 * getInformacionAdicional
	 *
	 * @return the informacionAdicional
	 */
	public String getInformacionAdicional() {
		return informacionAdicional;
	}
	/**
	 * setInformacionAdicional
	 *
	 * @param informacionAdicional the informacionAdicional to set
	 */
	public void setInformacionAdicional(String informacionAdicional) {
		this.informacionAdicional = informacionAdicional;
	}
	/**
	 * getResultado
	 *
	 * @return the resultado
	 */
	public Resultado getResultado() {
		return resultado;
	}
	/**
	 * setResultado
	 *
	 * @param resultado the resultado to set
	 */
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
    
    


}
