package com.Day7;

public class Member {
	String Name;
	int Age; 
	int Phone_number; 
	String Address; 
	double Salary;
	
	void printSalary(double salary) {
		
		System.out.println("Salary is: "+salary);
	}
	
}

class Employee extends Member{
	String Specialisation;
	String Department;
}

class Manager extends Member{
	String Specialisation;
	String Department;
}

class Main{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.Name="Chandan Mourya";
		
		e.Age=21;
		e.Phone_number=987654321;
		e.Address="Boisar";
		e.Specialisation="Developer";
		e.Department="IT";
		System.out.println("Employee name is: "+ e.Name);
		System.out.println(e.Specialisation);
		System.out.println(e.Department);
		System.out.println(e.Address);
		System.out.println(e.Age);
		System.out.println(e.Phone_number);
		e.printSalary(99999);
		System.out.println("=======================");
		
		Manager m=new Manager();
		m.Name="Shubham";
		m.Department="CS";
		m.Specialisation="fswd";
		m.Age=21;
		m.Phone_number=123456789;
		m.Address="vasai";
		
		System.out.println("Employee name is: "+ m.Name);
		System.out.println(m.Specialisation);
		System.out.println(m .Department);
		System.out.println(m.Address);
		System.out.println(m.Age);
		System.out.println(m.Phone_number);
		m.printSalary(100000);
	}
}