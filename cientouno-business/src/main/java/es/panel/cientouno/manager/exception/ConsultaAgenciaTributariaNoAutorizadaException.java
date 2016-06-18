package es.panel.cientouno.manager.exception;

public class ConsultaAgenciaTributariaNoAutorizadaException extends Exception {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1777674176115404859L;
	
	private Integer statusCode;
	
	/**
	 * Constructor of InternalErrorException
	 *
	 * @param statusCode
	 */
	public ConsultaAgenciaTributariaNoAutorizadaException(Integer statusCode){
		super();
		this.statusCode = statusCode;
	}
	
	/**
	 * Constructor of InternalErrorException
	 *
	 * @param message
	 * @param statusCode
	 */
	public ConsultaAgenciaTributariaNoAutorizadaException(String message, Integer statusCode){
		super(message);
		this.statusCode = statusCode;
	}
	
	/**
	 * Constructor of InternalErrorException
	 *
	 * @param message
	 * @param cause
	 * @param statusCode
	 */
	public ConsultaAgenciaTributariaNoAutorizadaException(String message, Throwable cause, Integer statusCode){
		super(message, cause);
		this.statusCode = statusCode;
	}

	/**
	 * getStatusCode
	 *
	 * @return the statusCode
	 */
	public Integer getStatusCode() {
		return statusCode;
	}
	
}
