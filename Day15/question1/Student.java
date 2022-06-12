package com.question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class InvalidDateFormate extends Exception{
	public InvalidDateFormate(String Message) {
		super(Message);
	}
}
public class Student {
	void StudentBirth(LocalDate DOB) {
		LocalDate ld=LocalDate.now();
		
		
		Period p = Period.between(DOB,ld);
		int age=p.getYears();
		if(age <=0) {
			System.out.println("“Date should not be in Future”.");
		}
		else {
			System.out.println("Your Age is: "+age);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String dob= sc.next();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
		LocalDate date = LocalDate.parse(dob, dtf);
		//System.out.println("Local Date is: "+ date);
		s.StudentBirth(date);
		}catch (Exception e){
		System.out.println("Invalid Date Formate");
		}
	}
}
