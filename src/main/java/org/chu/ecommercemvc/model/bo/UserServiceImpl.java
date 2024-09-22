package org.chu.ecommercemvc.model.bo;

import org.chu.ecommercemvc.exception.InvalidFieldsException;
import org.chu.ecommercemvc.model.bean.User;
import org.chu.ecommercemvc.model.dto.LoginDTO;
import org.chu.ecommercemvc.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl extends ServiceImpl<User, Long> implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User authenticate(LoginDTO loginDTO) {
        User user = userRepository.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
        if (user == null) {
            throw InvalidFieldsException.fromFieldError("password", "Mật khẩu không đúng");
        }
        return user;
    }

    @Override
    public Optional<User> findByUsernameIgnoreCase(String username) {
        return userRepository.findByUsernameIgnoreCase(username);
    }
}
