package com.chandan;

public class Runner {

	
	Drawing d; 
	//constructor injection point
	public Runner(Drawing d) {
		super();
		this.d = d;
	}


	//setter injection point
	
//	public void setD(Drawing d) {
//	this.d=d;
//	}
	
	public void runner() {
	
	d.draw();
	
	System.out.println("We DRAWN...");
	}

}
