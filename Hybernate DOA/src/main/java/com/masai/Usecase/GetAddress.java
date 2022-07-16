package com.masai.Usecase;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDaoImpl();
		
		int id=2;
		
		String add=dao.getAddressOfEmployee(id);
		
		System.out.println("address is: "+add);

	}

}
