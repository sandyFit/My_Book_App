package com.co.my_book_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.co.my_book_app.controller.dto.UserRegistrationDTO;

import com.co.my_book_app.service.UserService;

@Controller
@RequestMapping("/user_reg")
public class UserRegistrationController {


    UserService userService;


    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDTO returnNewUserRegistrationDTO() {
        return new UserRegistrationDTO();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "user_reg";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO registrationDTO) {
        userService.saveUser(registrationDTO);
        return "redirect:/user_reg?success";
    }
    
}
