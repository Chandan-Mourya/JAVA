package com.question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
	private int empTd;
	private String empName;
	private double salary;
	public int getEmpTd() {
		return empTd;
	}
	public void setEmpTd(int empTd) {
		this.empTd = empTd;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	Employee(){
		
	}
	public Employee(int empTd, String empName, double salary) {
		super();
		this.empTd = empTd;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(this.salary > e.salary) {
			return +1;
		}else if(this.salary < e.salary) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Employee> ts=new TreeSet<>();
		System.out.println("Enter number of employess");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Employee ID");
			int id=sc.nextInt();
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee salary");
			double salary=sc.nextInt();
			ts.add(new Employee(id,name,salary));
		}
		System.out.println("Employee Details Sorted by Salary");
		System.out.println();
		for(Employee i:ts) {
			
			System.out.println("Employee ID: "+i.getEmpTd());
			System.out.println("Employee Name :" +i.getEmpName());
			System.out.println("Employee Salary: "+i.getSalary());
			System.out.println();
		}
	}
}

























