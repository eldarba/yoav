package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1Connect {

	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/db3";
		// url += ";create=true"; // if you want to create a new database
		try {
			// connect
			Connection con = DriverManager.getConnection(url);
			System.out.println("connected to " + url);
			// disconnect
			con.close(); // this close may not happen
			System.out.println("disconnected from " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
