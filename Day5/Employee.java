package com.Day5;

import java.util.Scanner;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}




	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}




	public String getEmployeeName() {
		return employeeName;
	}




	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public double getNetSalary() {
		return netSalary;
	}




	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}




	public void calculateNetSalary(double a) {
		//System.out.println("aaaa"+a);
		double salary = getSalary();
		//System.out.println("Net Salary" + salary );
		double d=a/100;
		//System.out.println("DDDD"+d);
		
		double s=salary*(d);
		
		double net=salary-s;
		
		setNetSalary(net);
		
		}
	public double  getPFPercentage() {
		double a=7;
		return a;
	}
	
	
	
}
class Chandan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
	
		System.out.println("Enter Salary");
		double num = sc.nextDouble();
		System.out.println("Enter PF Percentage");
		int pf=sc.nextInt();
		
		Employee e = new Employee();
		e.setSalary(num);
		
		double aa=e.getPFPercentage();
		e.calculateNetSalary(aa);
		
		System.out.println("ID :"+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Net Salary : "+e.getNetSalary());
		
		
		

	}
}



	

	


