package com.question2;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class emp {

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
			 int x= stmt.executeUpdate("update employee set salary=salary+500");
			 
			 if(x >0 )
				 System.out.println("updated..");
			 else
				 System.out.println("not inserted");
			
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
