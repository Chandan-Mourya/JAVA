package com.question1;

public class Bird {

		public void fly(){
			System.out. println("I am flying");
		}
	}
	class Parrot extends Bird{
		@Override
		public void fly(){
			System.out. println("I am  flying");
		}
		public void sing() {
			System.out.println("I am singing");
		}
	}
	class Main{
		public static void main(String[] args) {
			Bird b1=new Parrot();
			b1.fly();
			Parrot p=(Parrot)b1;
			p.sing();
		}
	}

