package com.evaluation;

import java.util.Scanner;


public class Student {
	int roll;
	String name;
	String Address;
	int marks;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	void displaydetails() {
		System.out.println("roll no is: "+roll);
		System.out.println("Student name is: "+name);
		System.out.println("Student Address: "+Address);
		System.out.println("Student marks : "+marks);
	}
}
class Demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total=0;
		System.out.println("Enter no. of student:");
		int n=sc.nextInt();
		Student student=new Student();
		Student[] s=new Student[n];
		for(int i=0; i<n; i++) {
			System.out.println("===========================");
			System.out.println("Enter Roll nmumber:");
			int r=sc.nextInt();
			student.setRoll(r);
			
			System.out.println("Enter Student Name:");
			String nam=sc.next();
			student.setName(nam);
			
			sc.nextLine();
			System.out.println("Enter Address of Student:");
			String add=sc.nextLine();
			student.setAddress(add);
			
			System.out.println("Enter marks:");
			int mar=sc.nextInt();
			student.setMarks(mar);
			s[i]=new Student();
			
			//s[i].displaydetails();
			student.displaydetails();
			total+=student.getMarks();
		}System.out.println("================================");	
		System.out.println("Average of Marks is : "+total/n);
		//student.displaydetails();
//		}for(Student i:s) {
//			i.displaydetails();
//		}
		//System.out.println("hallo");
	}
}