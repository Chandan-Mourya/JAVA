package com.question2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Citizen {
	private String name;
	private String aadharNumber;
	private String mobileNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
	
}

class Demo{
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if (!Pattern.matches("[a-zA-z]{3,14}", name)) {
			return false;
		}
		if (!Pattern.matches("\\d{12}", aadharCard)) {
			return false;
		} 
		if(!Pattern.matches("[6-9]{1}\\d{9}", mobileNum)) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Citizen c=new Citizen();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name=sc.next();
		System.out.println("Enter your Aadhar number: ");
		String aadhar=sc.next();
		System.out.println("Enter Your  Mobile Number:");
		String mobile=sc.next();
		c.setAadharNumber(name);
		c.setMobileNumber(mobile);
		c.setName(aadhar);
		System.out.println("=================");
		boolean b=d.validate(c.getName(),c.getMobileNumber(), c.getAadharNumber());
		if(b) {
			System.out.println("Name: "+c.getName());
	         System.out.println("Aadhar No: "+c.getAadharNumber());
	         System.out.println("Mobile No: "+c.getMobileNumber());
		}else {
			System.out.println("Please Enter Rigth Details");
		}
		
		
	}
}













