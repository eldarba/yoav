package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo2Connect {

	public static void main(String[] args) {

		/*
		 * try with resource (ARM) will close the resource at the end of try block
		 */
		try (Scanner sc = new Scanner(System.in);) {

		}

		String url = "jdbc:derby://localhost:1527/db3";
		// ARM - Auto Resource Management
		try (Connection con = DriverManager.getConnection(url);) {
			System.out.println("connected to " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);
	}

}
