package com.palerra.assignments.platform;

public class ValidationException extends Exception {
	/**
     * 
     */
	private static final long serialVersionUID = 1234454678933L;

	/**
	 * Default constructor
	 */
	public ValidationException() {
		super();
	}

	/**
	 * Constructor with an error message
	 * 
	 * @param message
	 */
	public ValidationException(String message) {
		super(message);
	}

	/**
	 * Constructor with an error message and cause
	 * 
	 * @param message
	 * @param cause
	 */
	public ValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor with an error  cause
	 * 
	 * @param cause
	 */
	public ValidationException(Throwable cause) {
		super(cause);
	}
}
