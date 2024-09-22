package org.chu.ecommercemvc.model.repository;

import java.util.List;

public interface BaseRepository<T> {
    List<T> findAll();
    T findById(int id);
    T save(T t);
    T update(T t);
    void delete(T t);
}
