package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
	private static String url = "jdbc:postgresql://localhost:5432/smsdb";
	private static String usename = "postgres";
	private static String password = "dong19500311";
	
	public static Connection getConnection() {
		Connection cnt= null;
		try {
			cnt =DriverManager.getConnection(url , usename , password);
			return cnt;
			
		} catch (SQLException e) {
			return null;
		}
		
	}
	
}
