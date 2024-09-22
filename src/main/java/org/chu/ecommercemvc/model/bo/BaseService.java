package org.chu.ecommercemvc.model.bo;

import java.util.List;

public interface BaseService<T>{
    List<T> findAll();
    T findById(int id);
    T save(T t);
    T update(T t);
    void delete(T t);
}
