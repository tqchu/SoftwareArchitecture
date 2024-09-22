package org.chu.ecommercemvc.controller;

import org.chu.ecommercemvc.model.bean.User;
import org.chu.ecommercemvc.model.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    // Show the login form (GET request)
//    @GetMapping("/login")
//    public String showLoginForm(Model model) {
//        model.addAttribute("loginDTO", new LoginDTO()); // Add an empty loginDTO object
//        return "login"; // This will return the login.html form
//    }
//
//    // Process the login form (POST request)
//    @PostMapping("/login")
//    public String login(@ModelAttribute LoginDTO loginDTO, Model model) {
//        User user = userService.authenticate(loginDTO);
//
//        if (user != null) {
//            model.addAttribute("username", loginDTO.getUsername());
//            return "dashboard";  // Redirect to dashboard page instead of success page
//        } else {
//            model.addAttribute("error", "Invalid username or password");
//            return "login";  // Stay on login page if authentication fails
//        }
//    }
//}
