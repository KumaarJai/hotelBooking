package com.hotel.model;
import com.hotel.model.CustomError;

public class OutputHotelDetails {
	private CustomError error;
	private Hotels hotel;
	
	public CustomError getError() {
		return error;
	}
	public void setError(CustomError error) {
		this.error = error;
	}
	public Hotels getHotel() {
		return hotel;
	}
	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}
	
	
}
