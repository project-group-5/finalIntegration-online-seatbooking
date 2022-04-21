package com.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Entity

public class BookingDetails {
	@Id
	@GeneratedValue
	private int bookingId;
	@NotNull
	private String  bookingDate;
	private int seatnumber;
	@Max(1000)
	@Min(100)
	private int seatcost;
	private String seattype;
	@NotNull
	private String seatcolour;
	
    public BookingDetails() {
		
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public int getSeatcost() {
		return seatcost;
	}

	public void setSeatcost(int seatcost) {
		this.seatcost = seatcost;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public String getSeatcolour() {
		return seatcolour;
	}

	public void setSeatcolour(String seatcolour) {
		this.seatcolour = seatcolour;
	}
    
    



}
