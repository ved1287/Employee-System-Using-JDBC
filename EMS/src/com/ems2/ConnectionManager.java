package com.ems2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public  static Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/testemp";
		String username="root";
		String password="toor";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,username,password);
			
			
		}catch(SQLException e) {
			e.printStackTrace();	
		}
		return con;
	}
	public void closeConnection(Connection connection) {
		try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
