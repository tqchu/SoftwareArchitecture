package org.chu.ecommercemvc.model.bo;

import org.chu.ecommercemvc.model.bean.User;
import org.chu.ecommercemvc.model.dto.LoginDTO;

import java.util.Optional;

public interface UserService extends BaseService<User, Long> {
    User authenticate(LoginDTO loginDTO);
    Optional<User> findByUsernameIgnoreCase(String username);
}
