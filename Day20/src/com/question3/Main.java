package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l1=new ArrayList<>();
		l1.add(new Student(101,"chandan",980));
		l1.add(new Student(103,"shubham",750));
		l1.add(new Student(105,"mausam",630));
		l1.add(new Student(102,"vijay",270));
		l1.add(new Student(104,"shubham",710));
		

		
	List<Employee> e=l1.stream().map((s)->new Employee(s.getRoll(),s.getName(),1000*s.getMarks())).collect(Collectors.toList());
	System.out.println(e);
				
	}

}
