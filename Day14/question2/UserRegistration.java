package com.question2;

import java.util.Scanner;

class InvalidCountryException extends Exception{
	public InvalidCountryException(String errorMessage) {
		super();
	}
}




public class UserRegistration {
	
	void RegisterUser(String Username, String UserCountry) throws InvalidCountryException {
		if(!UserCountry.equalsIgnoreCase("india")) {
			System.out.println("“User Outside India cannot be registered”");
			throw new InvalidCountryException("“User Outside India cannot be registered”");
		}else {
			System.out.println("“User registration done successfully”");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		String name=sc.next();
		System.out.println("Enter Country Name:");
		String country=sc.next();
		UserRegistration r=new UserRegistration();
		try {
			r.RegisterUser(name, country);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("InvalidCountryException");
		}
		System.out.println("Normal Terminatin End of the main");
	}
	
	}

//class Main {
//	
//
//}





