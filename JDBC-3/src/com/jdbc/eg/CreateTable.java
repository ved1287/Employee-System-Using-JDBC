package com.jdbc.eg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/createtb";
		String username="root";
		String password="toor";
		Connection con=DriverManager.getConnection(url, username, password);
		String q="CREATE TABLE VEDTB(id int primary key auto_increment,name varchar(20),company varchar(20),email varchar(20))";
		Statement st=con.createStatement();
		st.executeUpdate(q);
		System.out.println("table successfully created");
		con.close();
		
	}

}
