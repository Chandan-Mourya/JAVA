package com.question3;

public class Employee {
		private int EmpId;
		private String EmpName;
		private int Salary;
		
		Employee(){
			
		}

		public Employee(int empId, String empName, int salary) {
			super();
			EmpId = empId;
			EmpName = empName;
			Salary = salary;
		}

		public int getEmpId() {
			return EmpId;
		}

		public void setEmpId(int empId) {
			EmpId = empId;
		}

		public String getEmpName() {
			return EmpName;
		}

		public void setEmpName(String empName) {
			EmpName = empName;
		}

		public int getSalary() {
			return Salary;
		}

		public void setSalary(int salary) {
			Salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Salary=" + Salary + "]";
		}
		
}
