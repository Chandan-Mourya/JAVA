package com.question2;

import java.io.Serializable;

public class Address implements Serializable {
	private String state;
	private String city;
	private String pincode;
	
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return this.state;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return this.city;
	}
	
	public void setPincode(String pincode) {
		this.pincode=pincode;
	}
	public String getPincode(){
		return this.pincode;
	}
	
	
	
	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		
	}
}
