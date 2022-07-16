package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.Entities.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		boolean flag = false;

		EntityManager em = EMUtil.provideConnection();

		em.getTransaction().begin();

		em.persist(emp);
		flag = true;
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		// TODO Auto-generated method stub

		EntityManager em = EMUtil.provideConnection();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {
			return emp.getAddress();
		} else {
			return "emp object is null bro..";
		}

	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub

		EntityManager em = EMUtil.provideConnection();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {
			em.getTransaction().begin();
			emp.setSalary(emp.getSalary() + bonus);
			em.merge(emp);
			em.getTransaction().commit();
			em.close();

			return "Bonus Given to the Employee";
		} else {
			return "Employee is not available";
		}

	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		boolean flag = false;
		EntityManager em = EMUtil.provideConnection();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {
			em.getTransaction().begin();
			em.remove(emp);
			flag = true;
			em.getTransaction().commit();
			em.clear();
		}

		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		// TODO Auto-generated method stub
		String[] str=new String[2]; 
		EntityManager em = EMUtil.provideConnection();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {
			str[0]=emp.getName();
			str[1]=emp.getAddress();
			return str;
		} else {
			str[0]="Employee not available";
			return str;
		}

		
	}

}
