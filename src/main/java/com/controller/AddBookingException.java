package com.controller;

import java.util.Arrays;

public class AddBookingException extends RuntimeException {
	
	public AddBookingException() {
		super("booking not confirmed");
	}

	@Override
	public String toString() {
		return "AddBookingException ";
	}
	

}
