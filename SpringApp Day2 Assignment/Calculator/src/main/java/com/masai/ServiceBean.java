package com.masai;

public class ServiceBean {
		
	private Calculator calc;
	private int a;
	private int b;
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	
	public void setA(int a) {
		this.a = a;
	}



	public void setB(int b) {
		this.b = b;
	}


	public void calculateSum() {
		calc.letsGO();
		int sum=this.a+this.b;
		
	System.out.println("Sum calculated in Service Layer..");
	System.out.println("Sum is: "+sum );
	}
	
	public void multiplication(int a, int b) { //a, b, or take any other variable 
		double mul=a*b;
		System.out.println("Multiplication is Done in Service Layer..");
		System.out.println("Mulatiplication is: "+mul );
	}
	
	public void substraction() {
		double sub=this.a-this.b;
		System.out.println("Substraction is Done in Service Layer..");
		System.out.println("Substraction is: "+sub);
	}

	
}
