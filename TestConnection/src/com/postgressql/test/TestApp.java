package com.postgressql.test ;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestApp {
	
	private static String url = "jdbc:postgresql://localhost:5432/testdb";
	private static String usename = "postgres";
	private static String password = "dong19500311";
	
	Connection getConnection() {
		Connection cnt= null;
		try {
			cnt =DriverManager.getConnection(url , usename , password);
			System.out.println("Connection to Postgersql!");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		return cnt;
		
	}
	
	public static void main(String[] args) {
		TestApp app = new TestApp();
		app.getConnection();
		
		
	}

}

