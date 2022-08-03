package com.ems1;

public class Employee {
	private int emp_id;
	private String Emp_name;
	private double salary;
	private String city;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(int emp_id, String emp_name, double salary, String city) {
		super();
		this.emp_id = emp_id;
		Emp_name = emp_name;
		this.salary = salary;
		this.city = city;
	}
	public Employee(String emp_name, double salary, String city) {
		super();
		Emp_name = emp_name;
		this.salary = salary;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", Emp_name=" + Emp_name + ", salary=" + salary + ", city=" + city + "]";
	}
	

}
