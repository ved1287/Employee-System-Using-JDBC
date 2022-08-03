package com.example.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String product_name;
	String category_name;
	LocalDate createdDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", category_name="
				+ category_name + ", createdDate=" + createdDate + "]";
	}
	public Product(int id, String product_name, String category_name, LocalDate createdDate) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.category_name = category_name;
		this.createdDate = createdDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 

}
