/*
* File: Resultado.java
* Author: david.garcia
* Date: 26/4/2016
*/
package es.panel.cientouno.manager.model;

/**
 * Description: resultado de la solicitud
 *
 * @date 26/4/2016
 * @author david.garcia
 *
 */
public enum Resultado {
	CONCEDIDO("CONCEDIDO"),
	DENEGADO("DENEGADO");
	
	private String resultado;
	
	Resultado(String resultado){
		this.resultado = resultado;
	}
	
    public boolean equals(String otherResultado) {
        return (otherResultado == null) ? false : resultado.equals(otherResultado);
    }
    
    public String toString() {
       return this.resultado;
    }
}
