package org.chu.ecommercemvc.controller;

import org.chu.ecommercemvc.model.bean.User;
import org.chu.ecommercemvc.model.bo.UserService;
import org.chu.ecommercemvc.model.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class UserController {

    @Autowired
    private UserService userService;

    // Process the login form (POST request)
    @PostMapping("")
    public User login(@RequestBody LoginDTO loginDTO) {
        return userService.authenticate(loginDTO);
    }
}
