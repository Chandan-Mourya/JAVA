package com.question2;

public class Animal {
	public void makeNoise(){
		System.out.println("Animal making Noise");
		}
		public void eat(){
		System.out.println("Animal is eating");
		}
		public void walk(){
		System.out.println("Animal is walking");
		}
}
class Cat extends Animal{
	@Override
	public void makeNoise() {
		System.out.println( "Meaw...");
	}
}
class Dog extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Barking....");
	}
	
}
class Tiger extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Raoring...");
	}
	
}

class Main{
	public static void main(String[] args) {
		Animal A[ ]= new Animal[3];
		A[0]=new Dog();
		A[1]=new Cat();
		A[2]=new Tiger();

		
		for(int i=0; i<A.length; i++) {
			A[i].makeNoise();
			A[i].eat();
			A[i].walk();
			System.out.println("==================");
		}
	}
}






