package com.question1;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		String cs = "jdbc:mysql://localhost:3306/jdbc";
		
		try {
			Connection conn=DriverManager.getConnection(cs,"root","Mysql@1234");
			
			Statement stmt = conn.createStatement();
			//System.out.println("Enter id");
			
//			int e=sc.nextInt();
			String query="select * from employee where eid='6';";
	         ResultSet rs = stmt.executeQuery(query);
	         System.out.println("id  name    Address salary");
	         
	         while (rs.next()) {
	            int eid = rs.getInt("eid");
	            String name = rs.getString("name");
	            String address = rs.getString("address");
	            String salary = rs.getString("salary");
	            System.out.println(eid+"   "+name+"       "+address+"      "+salary);
	         }
			
			if(conn!=null) {
				System.out.println("Connected Successfully...");
			}else {
				System.out.println("Not Connected...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
