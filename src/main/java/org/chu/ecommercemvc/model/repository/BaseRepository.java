package org.chu.ecommercemvc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface BaseRepository<T, U> extends JpaRepository<T, U> {
}
