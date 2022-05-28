package com.Day7;

import java.util.Scanner;

public class Bank {
	
	String branchName; 
	String IfscCode; 
	
	void displayDetails() {
		System.out.println("Brancch name is:"+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
	}
}

class AxisBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails() {
		System.out.println("Branch name is :"+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
		System.out.println("Rate of intrest is: "+rateOfInterest);
	}
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails() {
		System.out.println("Branch name is :"+branchName);
		System.out.println("IFSC Code is: "+IfscCode);
		System.out.println("Rate of intrest is: "+rateOfInterest);
	}
}


class Demo{
	public static Bank getBank(String bank) {
		if(bank=="axis") {
			AxisBank a=new AxisBank();
			a.branchName="Axis Bank Boisar";
			a.IfscCode="AXIS0001234";
			a.rateOfInterest=10;
			a.getCreditCard();
			return a;
		}else if(bank=="icici") {
			ICICIBank i=new ICICIBank();
			i.branchName="ICICI BANK BOISAR";
			i.IfscCode="ICICI0001234";
			i.rateOfInterest=7;
			return i;
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Name: ");
		String bank=sc.next();
		
		Bank a=d.getBank(bank);
		
		a.displayDetails();
		
		
		
		
		
		
	}
}