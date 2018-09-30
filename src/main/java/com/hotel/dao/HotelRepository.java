package com.hotel.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.model.Hotels;

@Repository
public interface HotelRepository extends CrudRepository<Hotels, Integer>{
	public List<Hotels> findByNameLike(String name);
	public Hotels findByName(String name);
	public List<Hotels> findByCity(String city);
	public List<Hotels> findByPostalCode(String locality);
	public List<Hotels> findAllByOrderByReviewsRatingDesc();
	public List<Hotels> findAll();
}
