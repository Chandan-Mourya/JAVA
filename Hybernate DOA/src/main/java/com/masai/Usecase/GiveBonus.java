package com.masai.Usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GiveBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao=new EmployeeDaoImpl();	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the empid:");
		int id=sc.nextInt();
		
		System.out.println("Enter the Bonus Amount");
		int bonus=sc.nextInt();
		
		
		String msg=dao.giveBonusToEmployee(id,bonus);
		
		System.out.println(msg);
		
		

	}

}
