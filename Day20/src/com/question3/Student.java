package com.question3;

public class Student {
		private int Roll;
		private String Name;
		private int Marks;
		public int getRoll() {
			return Roll;
		}
		public void setRoll(int roll) {
			Roll = roll;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getMarks() {
			return Marks;
		}
		public void setMarks(int marks) {
			Marks = marks;
		}
		
		Student(){
			
		}
		public Student(int roll, String name, int marks) {
			super();
			Roll = roll;
			Name = name;
			Marks = marks;
		}
		
		
}
