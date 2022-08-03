package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Product;
import com.example.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@PostMapping("/addProduct")
	public Product f1(@RequestBody Product product) {
		return this.service.addProduct(product);
		
	}
	@GetMapping("/listAllProduct")
	public List<Product>f2(){
		return this.service.getAllProducts();
		
	}
	@DeleteMapping("/deleteById/{pid}")
	public boolean f3(@PathVariable("pid")int id) {
		return this.service.deleteProductById(id);
	}
	@PutMapping("/update")
   public Product f4(@RequestBody Product product) {
		return this.service.updateProduct(product);      
   }
	@GetMapping("/getProductById{id}")
	public Product f5(@PathVariable("id") int id) {
		return this.service.getProductById(id);
	}
}
