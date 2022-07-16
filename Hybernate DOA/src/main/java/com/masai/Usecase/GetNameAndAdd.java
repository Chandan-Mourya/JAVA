package com.masai.Usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetNameAndAdd {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		
		int id=sc.nextInt();
		
		String[] str=dao.getNameAndAddress(id);
		
//		for(String x:str) {
//			System.out.println(x);
//		}
		System.out.println("Name is: "+str[0]);
		System.out.println("Address is: "+str[1]);
		
		
	}
}
