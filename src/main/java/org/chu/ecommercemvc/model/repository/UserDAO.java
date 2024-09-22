package org.chu.ecommercemvc.model.repository;

import org.chu.ecommercemvc.model.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    // Define a method to find a user by username and password
    User findByUsernameAndPassword(String username, String password);
}