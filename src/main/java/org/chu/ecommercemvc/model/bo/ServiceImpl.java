package org.chu.ecommercemvc.model.bo;


import org.chu.ecommercemvc.model.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl<T, U> implements BaseService<T, U> {
    @Autowired
    private BaseRepository<T, U> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(U u) {
        Optional<T> optional = repository.findById(u);
        return optional.orElse(null);
    }

    @Override
    public T save(T t) {
        return repository.save(t);
    }

    @Override
    public T update(T t) {
        return repository.save(t);
    }

    @Override
    public void delete(T t) {
        repository.delete(t);
    }
}
