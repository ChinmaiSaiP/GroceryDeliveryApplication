package com.cg.grocery.exception;


@SuppressWarnings("serial")
public class UserAlreadyExistException extends RuntimeException {
	public UserAlreadyExistException(String msg) {
		super(msg);
	}

}
