package com.co.my_book_app.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.my_book_app.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
}
