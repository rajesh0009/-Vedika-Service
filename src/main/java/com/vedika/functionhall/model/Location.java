package com.vedika.functionhall.model;

import javax.validation.constraints.NotNull;

public class Location {
	private String country;
	@NotNull(message="Enter the state")
	private String state;
	@NotNull(message="Enter the Address")
	private String streetAddress;
	@NotNull(message="Enter the city")
	private String city;
	@NotNull(message="Enter the zipcode")
	private String zipCode;
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Location [country=" + country + ", state=" + state + ", streetAddress=" + streetAddress + ", city="
				+ city + ", zipCode=" + zipCode + "]";
	}


}
