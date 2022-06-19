package com.question1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l1=new ArrayList<>();
		l1.add(new Student(101,"Chandan",500));
		l1.add(new Student(104,"Shubham",670));
		l1.add(new Student(103,"Sagar",300));
		l1.add(new Student(106,"vijay",170));
		l1.add(new Student(105,"Mihir",330));
		l1.add(new Student(102,"Mausam",970));
		
		l1.stream().filter(s->s.getMarks() > 500).forEach(s->{
//			System.out.println(s.getRoll());
//			System.out.println(s.getName());
//			System.out.println(s.getMarks());
//			System.out.println();
//			System.out.println("==========");
			System.out.println(s);
		});

	}

}
