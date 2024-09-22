package org.chu.ecommercemvc.model.repository;

import org.chu.ecommercemvc.model.bean.Product;
import org.chu.ecommercemvc.model.bean.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    // Define a method to find a user by username and password
    User findByUsernameAndPassword(String username, String password);
    Optional<User> findByUsernameIgnoreCase(String username);
}
