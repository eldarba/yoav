package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6StatementRead {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db3";

		try (Connection con = DriverManager.getConnection(url);) {
			// work with database here
			Statement stmt = con.createStatement();
			String sql = "select * from person";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);
			}
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
