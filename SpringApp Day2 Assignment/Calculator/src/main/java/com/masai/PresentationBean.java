package com.masai;

public class PresentationBean {
	
	private ServiceBean service;

	public void setService(ServiceBean service) {
		this.service = service;
	}

	public void present() {
		System.out.println("Pesenting the calculation in Presentation Layer");
		service.calculateSum();
		System.out.println("================================");
		service.multiplication(10,10);
		System.out.println("================================");
		service.substraction();
	}
}