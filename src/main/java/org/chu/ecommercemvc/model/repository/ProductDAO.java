package org.chu.ecommercemvc.model.repository;

import org.chu.ecommercemvc.model.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {
}