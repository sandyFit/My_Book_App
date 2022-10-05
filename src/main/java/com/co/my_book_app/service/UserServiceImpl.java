package com.co.my_book_app.service;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

import com.co.my_book_app.entity.Role;
import com.co.my_book_app.entity.Usuario;
import com.co.my_book_app.repository.UserRepository;

import lombok.AllArgsConstructor;

import com.co.my_book_app.controller.dto.UserRegistrationDTO;



@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepo;

    

    @Override
    public Usuario saveUser(UserRegistrationDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getFirstName(),
                registroDTO.getLastName(), registroDTO.getEmail(),
                registroDTO.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepo.save(usuario);
    }

    

    @Override
    public List<Usuario> showUsers() {
        // TODO Auto-generated method stub
        return null;
    }

}
