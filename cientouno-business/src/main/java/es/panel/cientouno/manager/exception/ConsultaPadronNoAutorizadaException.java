package es.panel.cientouno.manager.exception;

public class ConsultaPadronNoAutorizadaException extends Exception {
	

	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8302458322781087174L;
	
	private Integer statusCode;
	
	/**
	 * Constructor of InternalErrorException
	 *
	 * @param statusCode
	 */
	public ConsultaPadronNoAutorizadaException(Integer statusCode){
		super();
		this.statusCode = statusCode;
	}
	
	/**
	 * Constructor of InternalErrorException
	 *
	 * @param message
	 * @param statusCode
	 */
	public ConsultaPadronNoAutorizadaException(String message, Integer statusCode){
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
	public ConsultaPadronNoAutorizadaException(String message, Throwable cause, Integer statusCode){
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
