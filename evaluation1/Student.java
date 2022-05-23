package com.evaluation;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String studentName;
	int marks;
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

//	void Student() {
//		System.out.println("Student name is: "+ studentName);
//		System.out.println("Student Number is: "+rollNumber);
//		System.out.println("Student marks is: "+marks);
//	}
	
	void Student(int rollNumber, String studentName, int marks) {
		System.out.println("Student name is: "+studentName);
		System.out.println("Student Number is: "+rollNumber);
		System.out.println("Student marks is: "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of Students:");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			
			System.out.println("Enter Roll number :");
			int id=sc.nextInt();
			System.out.println("Enter Name of student: ");
			String name=sc.next();
			System.out.println("Enter marks of student:");
			int mark=sc.nextInt();
			s1.Student(id,name,mark);
			System.out.println("============================");
		}
	}
}
