package com.co.my_book_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.my_book_app.entity.Login;
import com.co.my_book_app.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repo;

    public Login login(String username, String password) {
        Login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
    
}
