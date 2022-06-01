package com.question3;

public abstract class Shape {
	public abstract int rectangleArea(int length, int breadth);
	public abstract int squareArea(int side);
	public abstract double circleArea(int radius);
}
class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		int area=length*breadth;
		return area;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int area=side*side;
		return area;
	}

	@Override
	public double circleArea(int radius) {
		// TODO Auto-generated method stub
		double area=3.14*radius*radius;
		return area;
	}
	
}

class Main{
	public static void main(String[] args) {
		Area a=new Area();
		System.out.println("Area of Circle : "+a.circleArea(5));
		System.out.println("Area Of Square: "+a.squareArea(10));
		System.out.println("Area of Rectangle : "+a.rectangleArea(10, 8));
	}
}







