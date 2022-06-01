package com.question1;

import java.util.Scanner;

public abstract class Student {
		String name;
		String Address;
		
		abstract double getPercentage();
		
		Student(String Address, String name){
			this.name=name;
			this.Address=Address;
		}
}

class ScienceStudent extends Student{
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	ScienceStudent(int phisicsMarks, int chemistryMarks, int mathsMarks, String name, String Address){
		super(name,Address);
		this.phisicsMarks=phisicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathsMarks=mathsMarks;
	}
	double getPercentage() {
		return (this.phisicsMarks+this.chemistryMarks+this.mathsMarks)/3;
	}
}
class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;
	

	public HistoryStudent(int historyMarks, int civicsMarks, String name, String Address) {
		super(name,Address);
		this.historyMarks=historyMarks;
		this.civicsMarks=civicsMarks;
	}


	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		return (this.historyMarks+this.civicsMarks)/2;
	}



	
}

class  AllStudents{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("marks of physics");
		int ph=sc.nextInt();
		System.out.println("marks of chem");
		int ch=sc.nextInt();
		System.out.println("marks of maths");
		int math=sc.nextInt();
		
		
		Student s=new ScienceStudent(ph,ch,math,"chandan","Boisar");
		Student h=new HistoryStudent(55,67,"Shubham","Vasai");
		System.out.println("percentage of Scince Stiudent "+s.getPercentage());
		System.out.println("Percentage of History Student "+h.getPercentage());
	}
	
	
	
	
	
	
	
	
	
	
	}