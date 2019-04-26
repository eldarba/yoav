package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Statement {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db3";

		try (Connection con = DriverManager.getConnection(url);) {
			// work with database here
			Statement stmt = con.createStatement();
			String sql = "insert into person values(106, 'Dacid', 88)";
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
