package com.cg.grocery.exception;

@SuppressWarnings("serial")

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String msg) {
        super(msg);
    }

}
