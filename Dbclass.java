package com.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbclass {
	static Connection con;
	public static Connection createc() {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/miniproject";
			//2) to establish connection
			con=DriverManager.getConnection(url, "root", "root");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
