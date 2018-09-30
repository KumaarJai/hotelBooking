package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.OutputHotelDetails;
import com.hotel.model.OutputHotelsList;
import com.hotel.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService service;

	@GetMapping("/getHotel") //Studio 6
	public ResponseEntity<OutputHotelDetails> fetchDetailsByName(@RequestParam("name") String name ){
		OutputHotelDetails h = service.getHotel(name);
		return new ResponseEntity<OutputHotelDetails>(h,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<OutputHotelsList> fetchhotels(){
		return new ResponseEntity<OutputHotelsList>(service.findAllHotels(),HttpStatus.OK);
	}
	
	@GetMapping("/searchHotels") //Studio
	public ResponseEntity<OutputHotelsList> serachByName(@RequestParam("name") String name ){
		OutputHotelsList h = service.searchHotels(name);
		return new ResponseEntity<OutputHotelsList>(h,HttpStatus.OK);
	}
	
	
	@GetMapping("/hotelsByLocality")
	public ResponseEntity<OutputHotelsList> fetchhotelsByLocality(@RequestParam("zip") String code){
		return new ResponseEntity<OutputHotelsList>(service.getHotelByPinCode(code),HttpStatus.OK);
	}
	
	@GetMapping("/hotelsByCity")
	public ResponseEntity<OutputHotelsList> fetchhotelsByCity(@RequestParam("city") String city){
		return new ResponseEntity<OutputHotelsList>(service.getHotelByCity(city),HttpStatus.OK);
	}
	
}
