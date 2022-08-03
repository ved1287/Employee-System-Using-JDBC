package com.ems;

import java.sql.SQLException;
import java.util.Scanner;

import com.ems1.Employee;
import com.ems2.EmployeeDAO;

public class Ems {
	

	public static void main (String[]args) throws SQLException {
		System.out.println("-----*****WELCOME TO EMPLOYEE MANAGEMENT SYSTEM*****-----");
		Scanner sc=new Scanner(System.in);
	
	while(true) {
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Press 1 to Add an Employee");
	System.out.println("Press 2 to Delete an Employee");
	System.out.println("Press 3 to display an Employee");
	System.out.println("Press 4 to display Employee By Id");
	System.out.println("Press 5 to Update Employee");
	System.out.println("Press 6 to exit from the App");
	int c=sc.nextInt();
	if(c==1) {
		//add Employee
		System.out.println("Enter Employee Name-:");
		String name=sc.next();
		System.out.println("Enter Employee Salary-:");
		double salary=sc.nextDouble();
		System.out.println("Enter Employee City-:");
		String city=sc.next();
		Employee emp=new Employee(name,salary,city);
		boolean answer=EmployeeDAO.insertEmployeeToDB(emp);
		if(answer) {
			System.out.println("Student is added Successfully");
		}
		else {
			System.out.println("Not added Successfully");
		}
		System.out.print(emp);
		
		
		
	}
	else if(c==2) {
		//delete an employee
		System.out.println("Enter Employee Id to be Deleted");
		int n=sc.nextInt();
		boolean d=EmployeeDAO.deleteEmployee(n);
		if(d) {
			System.out.println("Employee deleted successfully");
		}else {
			System.out.println("Not deleted Successfully");
		}
	}
	else if(c==3) {
		//display an employee
		EmployeeDAO.displayAllEmployee();
	}
	else if(c==4) {
		//display an employee by id
		System.out.println("Enter the Employee Id");
		int s=sc.nextInt();
		EmployeeDAO.displayEmployeeById(s);
	}
	else if(c==5) {
		//display an employee by id
		System.out.println("Enter the Employee Id");
		int s=sc.nextInt();
		boolean f3=EmployeeDAO.UpdateEmployee(s);
		if(f3) {
			System.out.println("Updated Successfully");
		}
		else {
			System.out.println("Not updated");
		}
	}
	else if(c==6) {
		System.out.println("-----THANK YOU,VISIT AGAIN!!!!-----");	
	}
	
	

}

}
}
