package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class JdbcPractice {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		String url = "jdbc:mysql://localhost:3306/subjectdb";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("connection start");
		String sql ="Select *from subject_table";
		Statement statement = (Statement) con.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		System.out.println("Sno"+"\t"+"Name"+"\t"+"Price");
		while (rs.next()) {
			System.out.println(+rs.getInt(1)+"\t" +rs.getString(2)+"\t"+rs.getInt(3));
			
		}
		/*String sql = "insert into subject_table(sno,name,price) values (7,'ROR',600)";*/
		/*String sql1 = "delete from subject_table where sno = 4";
		 int x = statement.executeUpdate(sql1);
		 if (x>0){
			 System.out.println("row deleted:"+x);
		  }else{
			 System.out.println("Data not found");
		 }
		con.close();
		System.out.println("Connection closed");
	}*/
		/*String sql2 = "Update subject_table set name = 'PHP' where sno = 7";
		int y = statement.executeUpdate(sql2);
		if(y>0){
			System.out.println("Number of row updated:"+y);
		}else{
			System.out.println("Data not found");
		}*/
		
		
	}
}
		
		
		

