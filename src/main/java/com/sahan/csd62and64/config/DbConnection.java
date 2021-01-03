package com.sahan.csd62and64.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	
	private static final String DB_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/csd6264_db";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	
	public static Connection getConnection() throws ClassNotFoundException {
		Class.forName(DB_CLASS_NAME);
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	} 
	

}
