package com.co.my_book_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.co.my_book_app.entity.Usuario;


@Repository
public interface UserRepository extends JpaRepository<Usuario, String> {
    

    
    
}
