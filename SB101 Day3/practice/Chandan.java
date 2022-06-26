package com.practice;

import java.io.Serializable;

public class Chandan implements Serializable {
	int roll;
	String name;
	public Chandan(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Chandan [roll=" + roll + ", name=" + name + "]";
	}
	
	
}
