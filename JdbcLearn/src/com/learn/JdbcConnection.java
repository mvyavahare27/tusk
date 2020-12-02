package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class JdbcConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		String url = "jdbc:mysql://localhost:3306/subjectdb";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection start");
		
		Statement statement = (Statement) con.createStatement();
		String sql = "insert into subject_table(sno,name,price) values(6,'python',980)";
		statement.executeUpdate(sql);
		System.out.println("Insert successfully");
		con.close();
		System.out.println("Connection closed");
	}

}
