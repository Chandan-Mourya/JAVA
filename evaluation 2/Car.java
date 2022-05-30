package com.evaluation;

import java.util.Scanner;

public class Car {
	int numberOfPassenger;
		int numberOfKms;
		public int getNumberOfPassenger() {
			return numberOfPassenger;
		}
		public void setNumberOfPassenger(int numberOfPassenger) {
			this.numberOfPassenger = numberOfPassenger;
		}
		public int getNumberOfKms() {
			return numberOfKms;
		}
		public void setNumberOfKms(int numberOfKms) {
			this.numberOfKms = numberOfKms;
		}
		
}

class Sedan extends Car{
	final int farePerKm =20;

	public int getFarePerKm() {
		return farePerKm;
	}
	public int calculateBill(int km) {
		int fare=km*farePerKm;
	//	System.out.println(car.getNumberOfKms());
		System.out.println("Fare is: "+fare);
		return fare;
	}
}
class HatchBack extends Car{
	final int farePerKm =15;
	public int getFarePerKm() {
		return farePerKm;
	}
	public int calculateBill(int km) {
		int fare=km*farePerKm;
	
		System.out.println("Fare is: "+fare);
		return fare;
	}
}
class OLA extends Car{
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h=new HatchBack();
			h.calculateBill(numberOfKMs);
			//System.out.println("h");
			return h;
		}else {
			Sedan s=new Sedan();
			s.calculateBill(numberOfKMs);
			//System.out.println("ss");
			return s;
		}
	}

	
}

class Main {
	public static void main(String[] args) {
		//Car car=new Car();
		OLA ola=new OLA();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Passangers");
		int p=sc.nextInt();
		System.out.println("Enter no of KM");
		int km=sc.nextInt();
		Car car=ola.bookCar(p, km);
		
		
		
		
		
	}
}




