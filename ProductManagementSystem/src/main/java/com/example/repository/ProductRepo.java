package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
