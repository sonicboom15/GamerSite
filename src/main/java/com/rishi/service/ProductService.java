package com.rishi.service;

import java.util.List;

import com.rishi.model.Product;

public interface ProductService {
	 
    Product findById(int id);
     
    void saveProduct(Product product);
     
    void updateProduct(Product product);
      
    List<Product> findAllProduct();      
}