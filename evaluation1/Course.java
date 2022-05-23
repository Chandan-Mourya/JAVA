package com.evaluation;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	 void displayCourseDetails() {
		System.out.println("Course Name is:  "+courseName);
		System.out.println("Course ID is : "+courseId);
		System.out.println("Course Fee is: "+courseFee);
	}
	static void authenticate( String username, String password) {
		if(username=="Admin" && password=="1234") {
			Course c1=new Course();
			c1.courseId=101;
			c1.courseName="java";
			c1.courseFee=20000;
			c1.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or password");
		}
	}
	public static void main(String[] args) {
		Course c1=new Course();
		c1.authenticate("Admin", "1234");
		//c1.displayCourseDetails();
		c1.authenticate("chandan", "1222");
	}
}
