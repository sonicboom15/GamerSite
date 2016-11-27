package com.rishi.dao;

import java.util.List;

import com.rishi.model.Product;

public interface ProductDao{
	Product findById(int id);
	
	void saveProduct(Product product);
    
    void deleteProductById(int id);
     
    List<Product> findAllProduct();
}