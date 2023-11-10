package com.itshare.spring.boot.rest.exception;

//2 create custom student exception
public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String message) {
		super(message);
	}
	
}
