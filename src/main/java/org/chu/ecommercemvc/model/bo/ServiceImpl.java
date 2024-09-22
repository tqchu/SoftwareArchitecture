package org.chu.ecommercemvc.model.bo;

import org.chu.ecommercemvc.model.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseRepository<T> repository;

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public T findById(int id) {
        return null;
    }

    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }
}
