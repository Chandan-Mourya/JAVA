package com.masai.Usecase;

import java.util.Scanner;

import com.masai.Entities.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class InsertEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		
		System.out.println("Enter name: ");
		String name=sc.next();
		
		System.out.println("Enter address: ");
		String add=sc.next();
		
		System.out.println("Enter salary: ");
		int sal=sc.nextInt();
		
		
		Employee emp=new Employee(id, name, add, sal);
		
		boolean flag=dao.createEmployee(emp);
		
		if(flag)
			System.out.println("Inserted Successfully...");
		else
			System.out.println("Not Inserted...");

	}

}
