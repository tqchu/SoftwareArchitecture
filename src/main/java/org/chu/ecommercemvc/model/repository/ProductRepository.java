package org.chu.ecommercemvc.model.repository;

import org.chu.ecommercemvc.model.bean.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {
}
