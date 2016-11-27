package com.rishi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rishi.model.Product;
import com.rishi.dao.ProductDao;
import com.rishi.service.ProductService;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	 
    @Autowired
    private ProductDao dao;
     
    public Product findById(int id) {
        return dao.findById(id);
    }
 
    public void saveProduct(Product product) {
        dao.saveProduct(product);
    }
    public void updateProduct(Product product) {
        Product entity = dao.findById(product.getId());
        if(entity!=null){
            entity.setName(product.getName());
            entity.setcost(product.getcost());
            entity.setDescp(product.getdescp());
        }
    }
 
    public void deleteProductById(int id) {
        dao.deleteProductById(id);
    }
     
    public List<Product> findAllProduct() {
        return dao.findAllProduct();
    }

}
 