package com.bridgelabz.fundoonotes.exception;

public class NotFoundError extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotFoundError() {
		super("Not Found");
	}

	public NotFoundError(String errorMsg) {
		super(errorMsg);
	}

}
