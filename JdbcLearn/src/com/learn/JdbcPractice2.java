package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPractice2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		String url ="jdbc:mysql://localhost:3306/subjectdb";
		String user ="root";
		String password ="root";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection started");
		//Insert query//
		/*int sno = 8;
		String name = "Dbms";
		int price = 600;
		PreparedStatement ps = con.prepareStatement("Insert into subject_table(sno,name,price) values(?,?,?)");
		ps.setInt(1,sno);
		ps.setString(2,name);
		ps.setInt(3,price);
		ps.executeUpdate();*/
		
		
		
		//result set//
		/*String sql ="Select * from subject_table";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		System.out.println("sno"+"\t"+"name"+"\t"+"price");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			
		}*/
		
		//Delete Query//
		/*String sql = "delete from subject_table where sno = 8";
		PreparedStatement ps = con.prepareStatement(sql);
		int x = ps.executeUpdate(sql);
		if (x>0) {
			System.out.println("Row deleted:"+x);
			
		}else{
			System.out.println("Data not found");
		}*/
		
		//Update Query//
		String sql1 ="Update subject_table set name ='DBMS'where sno = 7";
		PreparedStatement ps = con.prepareStatement(sql1);
		int y = ps.executeUpdate(sql1);
		if (y>0) {
			System.out.println("Row Updated:"+y);
			
		} else {
			System.out.println("Data not found");

		}
				
				
		
		
		System.out.println("Connection closed");
		con.close();
	
		
		
		
		
		
	

	}
}
