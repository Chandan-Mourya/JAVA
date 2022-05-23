package com.evaluation;

public class Shapes {

	public void area(double radius) {
		double area=2*3.14*radius;
		System.out.println("Area of Circle is: "+area);
	}
	public void area(int length, int breadth) {
		double area=length*breadth;
		System.out.println("Area of Rectangle is: "+area);
	}
	public void area(int side) {
		double area=side*side;
		System.out.println("Area of Square is: "+area);
	}
	
}
class Main1{
	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.area(5);
		s.area(5,7);
		s.area(9);
	}
	
}