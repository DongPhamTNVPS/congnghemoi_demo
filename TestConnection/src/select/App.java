package select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
	private static List<String> listOfFirstname;
	
	private static void getAllFirstname() {
		Connection cnt = null;
		PreparedStatement stm  = null;
		ResultSet res = null;
		
		try {
			String sql = "SELECT first_name FROM actor";
			cnt = Connection_data.getConnection();
			stm = cnt.prepareStatement(sql);
			res = stm.executeQuery();
			while(res.next()) {
				listOfFirstname.add(res.getString("first_name"));
			}
			
		} catch (SQLException e) {
			return;
		}finally {
			try {
				if(cnt!=null) {
					cnt.close();
				}
				if(stm != null) {
					stm.close();
				}
				if (res != null) {
					res.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		listOfFirstname = new ArrayList<>();
		getAllFirstname();
		for (String firstName : listOfFirstname) {
			System.out.println(firstName);
		}
	}

}
