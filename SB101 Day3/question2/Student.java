package com.question2;

import java.io.Serializable;

public class Student implements Serializable {
	private int roll;
	private  String name;
	Address address;
	private String email;
	private transient String password;
	
	public int getRoll() {
		return roll;
	}




	public void setRoll(int roll) {
		this.roll = roll;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}



	
	public Student(int roll, String name, Address address, String email, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}




	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address= City" + address.getCity() + ", PinCode= " + address.getPincode()+ ", email=" + email + ", password="
				+ password + "]";
	}




	public Student() {
		
	}
	
}
