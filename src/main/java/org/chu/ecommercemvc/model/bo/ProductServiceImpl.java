package org.chu.ecommercemvc.model.bo;

import org.chu.ecommercemvc.model.bean.Product;
import org.chu.ecommercemvc.model.bean.User;
import org.chu.ecommercemvc.model.dto.LoginDTO;
import org.chu.ecommercemvc.model.repository.ProductRepository;
import org.chu.ecommercemvc.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<Product, Long> implements ProductService {
    @Autowired
    private ProductRepository productRepository;
}
