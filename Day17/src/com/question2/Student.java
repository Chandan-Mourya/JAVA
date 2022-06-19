package com.question2;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	private int roll;
	private String name;
	private int mark;
	public Student() {
	}
	public Student(int roll, String name, int mark) {
	this.roll = roll;
	this.name = name;
	this.mark = mark;
	}
	public int getRoll() {
	return roll;
	}
	public void setRoll(int roll) {
	this.roll = roll;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getMark() {
	return mark;
	}
	public void setMark(int mark) {
	this.mark = mark;
	}

}
class StudentMarksComp implements Comparator<Student> {
@Override
public int compare(Student s1, Student s2) {
if(s1.getMark() > s2.getMark())
return +1;
else if(s1.getMark() < s2.getMark())
return -1;
else
return 0;
}
}

class Main {
public static void main(String[] args) {
List<Student> students = new ArrayList<>();
students.add(new Student(10,"name1",850));
students.add(new Student(12,"name2",450));
students.add(new Student(14,"name3",950));
students.add(new Student(15,"name4",550));
students.add(new Student(16,"name5",650));
Collections.sort(students,new StudentMarksComp());
for(Student student: students){
	System.out.println("Roll :"+student.getRoll());
	System.out.println("Name :"+student.getName());
	System.out.println("Marks :"+student.getMark());
	System.out.println("==============================");
	}
}
}















