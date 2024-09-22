package org.chu.ecommercemvc.model.bo;

import org.chu.ecommercemvc.model.bean.Product;

import java.util.List;

public interface ProductService {

    // Fetch all products
    List<Product> getAllProducts();

    // Save a product
     Product saveProduct(Product product);

    // Find a product by id
    Product getProductById(Long id) ;

    // Delete a product
    void deleteProduct(Long id);
}
