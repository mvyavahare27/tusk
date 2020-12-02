package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class PreparedStatementTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		String url = "jdbc:mysql://localhost:3306/subjectdb";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection started");
		int sno = 7;
		String name = "RoR";
		int price = 700;
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("Insert into subject_table(sno,name,price) values(?,?,?)");
		ps.setInt(1, sno);
		ps.setString(2, name);
		ps.setInt(3, price);
		ps.executeUpdate();
		System.out.println("Inserted successfully");
		con.close();
	}

}
