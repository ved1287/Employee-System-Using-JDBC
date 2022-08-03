package com.ems2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ems1.Employee;

public class EmployeeDAO {
	public static boolean insertEmployeeToDB(Employee empl) {
		boolean f=false;
		try {
			Connection con=ConnectionManager.createConnection();
			String q="insert into employ (emp_name,city,salary) values(?,?,?)";
			PreparedStatement pt=con.prepareStatement(q);
			pt.setString(1, empl.getEmp_name());
			pt.setString(2, empl.getCity());
			pt.setDouble(3, empl.getSalary());
			pt.executeUpdate();
			f=true;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteEmployee(int n) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=ConnectionManager.createConnection();
			String q="delete from employ where id=?";
			PreparedStatement pt=con.prepareStatement(q);
			pt.setInt(1, n);
			pt.executeUpdate();
			f=true;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void displayAllEmployee() {
		// TODO Auto-generated method stub
		Connection con=ConnectionManager.createConnection();
		String q="select * from employ";
		Statement st = null;
		ResultSet set = null;
		try {
			 st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 set=st.executeQuery(q);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			while(set.next()) {
				int id=set.getInt(1);
				String emp_name=set.getString(2);
				double salary=set.getDouble(3);
				String city=set.getString(4);
				System.out.println("ID: " + id);
				System.out.println("Employee Name: " + emp_name);
				System.out.println("Salary: " + salary);
				System.out.println("City: " + city);
				System.out.println("**************************");
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void displayEmployeeById(int s) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionManager.createConnection();
		String q="select * from employ where id=?";
		PreparedStatement pt=con.prepareStatement(q);
		pt.setInt(1, s);
		ResultSet set=pt.executeQuery();
		while(set.next()) {
			int id=set.getInt(1);
			String emp_name=set.getString(2);
			double salary=set.getDouble(3);
			String city=set.getString(4);
			System.out.println("ID: " + id);
			System.out.println("Employee Name: " + emp_name);
			System.out.println("Salary: " + salary);
			System.out.println("City: " + city);
			System.out.println("**************************");
		
				
			
		}
		
	

	}

	public static boolean UpdateEmployee(int s) throws SQLException {
	boolean f=false;
		// TODO Auto-generated method stub
		Connection con=ConnectionManager.createConnection();
		String q="update employ set emp_name=?,salary=?,city=? where id=?";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter new Employee Name");
		String newemployee_name=sc.next();
		System.out.println("Enter new Salary");
		double newsalary=sc.nextDouble();
		System.out.println("Enter new city");
		String newcity=sc.next();
		
		
		PreparedStatement pt=con.prepareStatement(q);
		
		pt.setString(1, newemployee_name);
		pt.setDouble(2, newsalary);
		pt.setString(3, newcity);
		pt.setInt(4, s);
		pt.executeUpdate();
		return f=true;
		
		
		
		
	}
	
}


