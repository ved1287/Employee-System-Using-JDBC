package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Product;
import com.example.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo repo;

	public Product addProduct(Product product) {

		return this.repo.save(product);
	}

	public List<Product> getAllProducts() {

		return this.repo.findAll();
	}

	public boolean deleteProductById(int id) {
		this.repo.deleteById(id);
		return true;
         
		
	}

	public Product updateProduct(Product product) {
		return this.repo.save(product);
	}

	public Product getProductById(int id) {
       Optional<Product>optional=repo.findById(id);
       if(optional.isPresent()) {
    	   return optional.get();
       }
       return null;
	}
	

}
