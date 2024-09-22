package org.chu.ecommercemvc.model.bo;

import java.util.List;

public interface BaseService<T, U>{
    List<T> findAll();
    T findById(U u);
    T save(T t);
    T update(T t);
    void delete(T t);
}
