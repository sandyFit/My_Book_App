package com.co.my_book_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.co.my_book_app.controller.dto.UserRegistrationDTO;

import com.co.my_book_app.entity.Usuario;


@Service
public interface UserService  {


    public Usuario saveUser(UserRegistrationDTO registrationDTO);

    public List<Usuario> showUsers();
    
    
}
