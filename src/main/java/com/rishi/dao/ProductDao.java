package com.rishi.dao;

import java.util.List;

import com.rishi.model.Product;

public interface ProductDao{
	Product findById(int id);
	
	void saveStudent(Product product);
    
    void deleteProductById(String id);
     
    List<Product> findAllProduct();	
}