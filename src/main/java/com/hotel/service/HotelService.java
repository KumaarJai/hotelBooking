package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hotel.dao.HotelRepository;
import com.hotel.model.CustomError;
import com.hotel.model.Hotels;
import com.hotel.model.OutputHotelDetails;
import com.hotel.model.OutputHotelsList;

@Service
public class HotelService {
	
	@Autowired
	HotelRepository repo;
	
	public OutputHotelsList findAllHotels(){
		OutputHotelsList out=new OutputHotelsList();
		try {
			List<Hotels> h = repo.findAllByOrderByReviewsRatingDesc();
			if(h.size()>0) {
				out.setHotelList(h);
				out.setError(null);
			}else {
				out.setHotelList(null);
				out.setError(new CustomError(HttpStatus.OK, "No record(s) found"));
			}
		} catch (Exception e) {
			out.setHotelList(null);
			out.setError(new CustomError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
		}
		return out;
	}
	
	public OutputHotelsList searchHotels(String name) {
		OutputHotelsList out=new OutputHotelsList();
		try {
			List<Hotels> h = repo.findByNameLike(name);
			if(h.size()>0) {
				out.setHotelList(h);
				out.setError(null);
			}else {
				out.setHotelList(null);
				out.setError(new CustomError(HttpStatus.OK, "No hotels found matching pattern : "+name));
			}
		} catch (Exception e) {
			out.setHotelList(null);
			out.setError(new CustomError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
		}
		return out;
	}
	
	public OutputHotelDetails getHotel(String name) {
		OutputHotelDetails out=new OutputHotelDetails();
		try {
			Hotels h = repo.findByName(name);
			if(h!=null) {
				out.setHotel(h);
				out.setError(null);
			}else {
				out.setHotel(null);
				out.setError(new CustomError(HttpStatus.OK, "No hotels found with name : "+name));
			}
		} catch (Exception e) {
			out.setHotel(null);
			out.setError(new CustomError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
		}
		return out;
	}
	
	public OutputHotelsList getHotelByCity(String city){
		OutputHotelsList out=new OutputHotelsList();
		try {
			List<Hotels> h = repo.findByCity(city);
			if(h.size()>0) {
				out.setHotelList(h);
				out.setError(null);
			}else {
				out.setHotelList(null);
				out.setError(new CustomError(HttpStatus.OK, "No hotels found in city : "+city));
			}
		} catch (Exception e) {
			out.setHotelList(null);
			out.setError(new CustomError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
		}
		return out;
	}
	
	public OutputHotelsList getHotelByPinCode(String code){
		OutputHotelsList out=new OutputHotelsList();
		try {
			List<Hotels> h = repo.findByPostalCode(code);
			if(h.size()>0) {
				out.setHotelList(h);
				out.setError(null);
			}else {
				out.setHotelList(null);
				out.setError(new CustomError(HttpStatus.OK, "No hotels found in ZipCode : "+code));
			}
		} catch (Exception e) {
			out.setHotelList(null);
			out.setError(new CustomError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
		}
		return out;
	}
}
