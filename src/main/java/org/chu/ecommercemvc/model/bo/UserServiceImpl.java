package org.chu.ecommercemvc.model.bo;

import org.chu.ecommercemvc.model.bean.User;
import org.chu.ecommercemvc.model.dao.UserDAO;
import org.chu.ecommercemvc.model.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public User authenticate(LoginDTO loginDTO) {
        return userDAO.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
    }
}
