package com.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class OfficeRestExceptionController {
	@ExceptionHandler(DeleteOfficeException.class)
	public ResponseEntity<?> handleDeleteException(DeleteOfficeException e,WebRequest req)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
	}
    
	@ExceptionHandler(UpdateOfficeException.class)
	public ResponseEntity<?> handleUpdateException(UpdateOfficeException e,WebRequest req)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(AddBookingException.class)
	public ResponseEntity<?> handleadd(AddOfficeException e, WebRequest req)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NO_CONTENT);
		
	}
	
	
}
