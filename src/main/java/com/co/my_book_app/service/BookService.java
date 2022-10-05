package com.co.my_book_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.my_book_app.entity.Book;
import com.co.my_book_app.repository.BookRepository;



@Service
public class BookService {

    @Autowired
    BookRepository repo;

    public List<Book> listAllBooks() {
        return (List<Book>) repo.findAll();
    }

    public Book findBook(int id) {
        Optional<Book> result = repo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        return new Book();
    }

    public Book addBook(Book book) {
        return repo.save(book);
    }

    public Book updateBook(Book book) {
        Optional<Book> result = repo.findById(book.getId());
        Book b = result.get();
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setDescription(book.getDescription());
        b.setPages(book.getPages());
        b.setRating(book.getRating());
        return repo.save(b);
    }

    public void deleteBook(int id) {
        repo.deleteById(id);
    }
    
}
