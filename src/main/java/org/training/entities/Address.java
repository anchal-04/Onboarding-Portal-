package org.training.entities;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String doorNumberAndStreet;
	private String streetLine2;
	private String city;
	private String state;
	private String country;
	private int pincode;

	public Address() {
	}

	public Address(String doorNumberAndStreet, String streetLine2, String city, String state, String country,
			int pincode) {
		this.doorNumberAndStreet = doorNumberAndStreet;
		this.streetLine2 = streetLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public String getDoorNumberAndStreet() {
		return doorNumberAndStreet;
	}

	public void setDoorNumberAndStreet(String doorNumberAndStreet) {
		this.doorNumberAndStreet = doorNumberAndStreet;
	}

	public String getStreetLine2() {
		return streetLine2;
	}

	public void setStreetLine2(String streetLine2) {
		this.streetLine2 = streetLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorNumberAndStreet=" + doorNumberAndStreet + ", streetLine2=" + streetLine2 + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
}
