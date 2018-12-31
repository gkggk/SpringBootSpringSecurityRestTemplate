package com.example.StarterProject.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	
	private DBHelper() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection(){
		
		Connection connection=null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sample", "postgres", "ggktech123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		return connection;
		
	}
}
