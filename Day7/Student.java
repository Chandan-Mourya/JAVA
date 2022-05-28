package com.Day7;

import java.util.Scanner;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	
	public double payFee(double examFee) {
		return examFee;
	}
	
	void displayDetails() {
		System.out.println("student id is "+studId);
		System.out.println("student Name is "+studName);
		System.out.println("Your examFee is "+examFee);
	
	}

}
	class DayScholar extends Student{
		double transportFee;
		@Override
		public double payFee(double examFee) {
			System.out.println("Paying Fee "+examFee);
			double s=examFee-transportFee;
			System.out.println("remaining amount to be paid "+s);
			return s;
		}
		
	}
	
	class Hosteller extends Student{
		double hostelFee;
		@Override
		public double payFee(double examFee) {
			System.out.println("Paying Fee "+examFee);
			double s=examFee-hostelFee;
			System.out.println("remaining amount to be paid "+s);
			return s;
		}

	}
class Main1{
	public static void main(String[] args) {
		DayScholar d=new DayScholar();
		d.studId=101;
		d.studName="Shubham";
		d.transportFee=10000;
		d.examFee=15000;
		d.displayDetails();
		d.payFee(13000);
		
		System.out.println("=========================");
		
		Hosteller h=new Hosteller();
		h.studId=102;
		h.studName="Vijay";
		h.hostelFee=11000;
		h.examFee=15000;
		h.displayDetails();
		h.payFee(13000);
		
	}
}

