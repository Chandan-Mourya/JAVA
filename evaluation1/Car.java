package com.evaluation;

public class Car {
	String model;
	String companyName;
	String Color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	void cardetails() {
		System.out.println("Car Model: "+model);
		System.out.println("Car Compony: "+companyName);
		System.out.println("Car Color: "+Color);
		
	}

}

class Engine{
	int rmp;
	int Power;
	String manufacturer;
	Boolean hasTurbo;
	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Boolean getHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(Boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	void displayCar() {
		Engine e=new Engine();
		e.setHasTurbo(true);
		e.setRmp(100000);
		e.setPower(120);
		e.setManufacturer("TATA");
		e.cardet();
		
	}
	void cardet() {
		System.out.println("Car rpm :"+rmp);
		System.out.println("Car Power :"+Power);
		System.out.println("Car Manufacturer : "+ manufacturer);
		System.out.println("Has Turbo :"+hasTurbo);
	}
}

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setModel("Tiago");
		c.setColor("Black");
		c.setCompanyName("tata");
		c.cardetails();
		Engine e=new Engine();
		e.displayCar();

	}

}

