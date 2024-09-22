package org.chu.ecommercemvc.model.bo;


import org.chu.ecommercemvc.model.bean.Product;
import org.chu.ecommercemvc.model.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    // Fetch all products
    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }

    // Save a product
    public Product saveProduct(Product product) {
        return productDAO.save(product);
    }

    // Find a product by id
    public Product getProductById(Long id) {
        return productDAO.findById(id).orElse(null);
    }

    // Delete a product
    public void deleteProduct(Long id) {
        productDAO.deleteById(id);
    }
}