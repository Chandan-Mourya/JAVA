package com.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String Message){
		super(Message);
	}
}
public class EmployeeBonus {

	double EmployeeBonus(LocalDate DOJ) throws InvalidAgeException {
		LocalDate curr=LocalDate.now();
		
		Period p=Period.between(DOJ, curr);
		int exp=p.getYears();
		if(exp<0) {
			
			throw new InvalidAgeException("Age Should not be in Future");
		}
		else if(exp <= 1) {
			return 5000;
		}else if(exp>1 && exp<=2) {
			return 8000;
		}else {
			return 10000;
		}
		
		
	}
}

class Main{
	public static void main(String[] args) {
		EmployeeBonus ep=new EmployeeBonus();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date Of joining");
		String doj=sc.next();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			LocalDate d=LocalDate.parse(doj, dtf);
			try {
				System.out.println("Bonus is: "+ep.EmployeeBonus(d));
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("“Please pass the date in the correct format”;");
		}
		
		
		

		System.out.println("Normal Termination of the Code:");
	}
	
	
}