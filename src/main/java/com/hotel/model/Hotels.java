package com.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Hotels {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String address;
	private String categories;
	private String city;
	private String country;
	private String latitude;
	private String longitude;
	private String name;
	private String postalCode;
	private String province;
	private String reviewsRating;
	private String reviewsText;
	private String reviewsTitle;
	private String reviewsUsername;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getReviewsRating() {
		return reviewsRating;
	}
	public void setReviewsRating(String reviewsRating) {
		this.reviewsRating = reviewsRating;
	}
	public String getReviewsText() {
		return reviewsText;
	}
	public void setReviewsText(String reviewsText) {
		this.reviewsText = reviewsText;
	}
	public String getReviewsTitle() {
		return reviewsTitle;
	}
	public void setReviewsTitle(String reviewsTitle) {
		this.reviewsTitle = reviewsTitle;
	}
	public String getReviewsUsername() {
		return reviewsUsername;
	}
	public void setReviewsUsername(String reviewsUsername) {
		this.reviewsUsername = reviewsUsername;
	}
	
	
}
