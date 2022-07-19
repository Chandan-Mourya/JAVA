package com.chandan;
import java.util.Scanner;

public class City {
	
	public static void findCapital(String city) {
		switch (city) {
		case "Mumbai":
			System.out.println("Financial City");
		
			break;
		case "Delhi":
			System.out.println("Capital of Country");
			break;
		case "Kolkatak":
			System.out.println("City of Joy");

		default:
			System.out.println("May be another City");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c=new City();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter City Name");
		String city=sc.next();
		findCapital(city);
	}

}
