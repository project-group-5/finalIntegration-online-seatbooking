package com.controller;

import java.util.Arrays;

public class UpdateOfficeException extends RuntimeException {
	
	public UpdateOfficeException()
	{
		super("updated cannot done");
	}

	@Override
	public String toString() {
		return "updated cannot done";
	}
	

}
