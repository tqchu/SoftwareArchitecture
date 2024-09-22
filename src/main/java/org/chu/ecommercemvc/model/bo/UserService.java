package org.chu.ecommercemvc.model.bo;

import org.chu.ecommercemvc.model.bean.User;
import org.chu.ecommercemvc.model.dto.LoginDTO;

public interface UserService {
    User authenticate(LoginDTO loginDTO);
}
