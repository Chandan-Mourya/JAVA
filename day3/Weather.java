package com.day3;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isSnowing =false;
		boolean isRaining =true;
		double temprature=65;
		
		if(isSnowing) {
			System.out.println("its Snowing");
		}
		else if(isRaining) {
			System.out.println("its Raining");
		}
		else if(temprature < 50) {
			System.out.println(" Below 10 degrees Celsius");
		}
		else {
			System.out.println("Let’s go out!");
		}
	}

}
