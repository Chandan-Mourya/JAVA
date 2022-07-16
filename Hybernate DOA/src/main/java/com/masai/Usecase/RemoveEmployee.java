package com.masai.Usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class RemoveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id: ");
		int id=sc.nextInt();
		
		boolean flag=dao.deleteEmployee(id);
		
		if(flag)
			System.out.println("Employee deleted");
		else
			System.out.println("Not Deleted...");
		
	}

}
