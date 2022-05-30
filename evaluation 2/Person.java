package com.evaluation;

public class Person {
	String name;
	String gender;
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
}

class Address {
	String city;
	String state;
	int pinCode;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
}

class  Instructor extends Person{
	int instructorID;
	int salary;
	@Override
	public String toString() {
		return "Instructor [instructorID=" + instructorID + ", salary=" + salary + "]";
	}
	
}
class Student extends Person{
	int studentId;

	String courseEnrolled;
	int courseFee;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}
	
}

class Main{
	public static Person generatePerson(Person person) {
		Person p=new Person();
		
		return p;
	}
	public static Person genertePerson(Person person) {
		Student s=new Student();
		
		return s;
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentId=1;
		s.courseEnrolled="Yes";
		s.courseFee=500;
		Instructor i= new Instructor();
		i.instructorID=101;
		i.salary=500000;
		Person newStudent = generatePerson(new Student());
		newStudent.toString();
		
		//ds
		Person newTeacher = genertePerson(new Instructor());
		newTeacher.toString();
		System.out.println(newStudent);
		System.out.println(newTeacher);
		}
}
