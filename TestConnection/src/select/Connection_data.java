package select;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_data {
	
	private static String url = "jdbc:postgresql://localhost:5432/dvdrental2";
	private static String usename = "postgres";
	private static String password = "dong19500311";
	
	public static Connection getConnection() {
		Connection cnt= null;
		try {
			cnt =DriverManager.getConnection(url , usename , password);
			//System.out.println("Connection to Postgersql!");
			return cnt;
			
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
			// TODO: handle exception
			return null;
		}
		
	}
	
}
