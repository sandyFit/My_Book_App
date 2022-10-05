package com.co.my_book_app.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class LoginController {


    @GetMapping("/")
    public String home() {
        return "index";

    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    

    
    
}
