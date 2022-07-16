package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	
	public static Connection provideConnection() {
		
		Connection conn = null; 
		

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
			
		

		String cs = "jdbc:mysql://localhost:3306/sb101db";
		
		
		try {
			conn= DriverManager.getConnection(cs,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return conn;
	}

}
