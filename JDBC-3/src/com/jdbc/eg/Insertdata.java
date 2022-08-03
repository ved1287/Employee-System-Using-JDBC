package com.jdbc.eg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertdata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/createtb";
		String username="root";
		String password="toor";
		Connection con=DriverManager.getConnection(url, username, password);
		String q="insert into vedtb(name,company,email) values (?,?,?)";
		PreparedStatement pst=con.prepareStatement(q);
//		pst.setString(1, "Ved");
//		pst.setString(2, "Zensar");
//		pst.setString(3, "ved@gmail.com");
//	     pst.executeUpdate();
//	     System.out.println("Data inserted successfully");
//	     con.close();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=sc.next();
		System.out.println("enter your company name: ");
		String cmp=sc.next();
		System.out.println("enter your password: ");
		String psd=sc.next();
		pst.setString(1, name);
		pst.setString(2, cmp);
		pst.setString(3, psd);
		pst.executeUpdate();
		 System.out.println("Data inserted successfully");
		 con.close();
		
		
		
		
		
		
	}

}
