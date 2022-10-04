package com.co.my_book_app.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.my_book_app.entity.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {

    Login findByUsernameAndPassword(String username, String password);
    
}
