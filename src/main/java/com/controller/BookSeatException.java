package com.controller;
import com.model.Seat;

public class BookSeatException extends RuntimeException {
	private static int id;
	private Object duration;
	public BookSeatException(Seat s) {
		
		Seat s1=new Seat();
		this.duration=duration;
	
		
	}

	@Override
	public String toString() {
		return  "Booking cannot be done";
	}


}
