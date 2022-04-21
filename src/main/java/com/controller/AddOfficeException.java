package com.controller;

import com.model.Office;

public class AddOfficeException extends RuntimeException {
	
	public AddOfficeException(Office office) {
		super("missing some details");
	}

	@Override
	public String toString() {
		return "missing some  details";
	}
	
	
	

}
