package com.hotel.model;

import java.util.List;
import com.hotel.model.CustomError;

public class OutputHotelsList {
	private CustomError error;
	private List<Hotels> hotelList;
	
	public CustomError getError() {
		return error;
	}
	public void setError(CustomError error) {
		this.error = error;
	}
	public List<Hotels> getHotelList() {
		return hotelList;
	}
	public void setHotelList(List<Hotels> hotelList) {
		this.hotelList = hotelList;
	}
	
	
}
