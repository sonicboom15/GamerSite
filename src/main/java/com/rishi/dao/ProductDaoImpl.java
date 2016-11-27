package com.rishi.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import com.rishi.dao.AbstractDao;
import com.rishi.dao.ProductDao;
import com.rishi.model.Product;
@Repository("productDao")
public class ProductDaoImpl extends AbstractDao<Integer, Product> implements ProductDao {
	public Product findById(int id) {
        return getByKey(id);
    }
	public void saveStudent(Product product){
		persist(product);
	}
	public void saveProduct(Product product) {
	        persist(product);
	}

    @SuppressWarnings("unchecked")
    public List<Product> findAllProduct() {
        Criteria criteria = createEntityCriteria();
        return (List<Product>) criteria.list();
    }
	public void deleteProductById(String id) {
		Query query = getSession().createSQLQuery("delete from Product where pro_id = :id");
        query.setString("pro_id", id);
        query.executeUpdate();
	}
}
