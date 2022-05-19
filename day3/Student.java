package com.day3;

public class Student {
		int roll;
		String  name;
		int marks;
		void displayStudentDetails() {
			System.out.println("Roll is "+roll);
			System.out.println("Name is "+name);
			System.out.println("Marks is "+marks);
			System.out.println("-------------------");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1= new Student();
			s1.roll=1;
			s1.name="Prem";
			s1.marks=96;
			s1.displayStudentDetails();
			
			s1.roll=2;
			s1.name="Chandan";
			s1.marks=90;
			s1.displayStudentDetails();
			
			s1=null;
			
	}

}
