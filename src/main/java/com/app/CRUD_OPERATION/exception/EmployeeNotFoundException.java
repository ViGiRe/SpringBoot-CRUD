package com.app.CRUD_OPERATION.exception;

public class EmployeeNotFoundException extends RuntimeException{
	
	public EmployeeNotFoundException(Long eId) {
		super("could not find employee"+ eId);
	}

}
