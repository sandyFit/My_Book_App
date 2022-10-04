package com.co.my_book_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.co.my_book_app.entity.Book;
import com.co.my_book_app.service.BookService;

@Controller
public class BookContoller {

    @Autowired
    BookService service;

    @GetMapping("/")
    public String home() {
        return "index";

    }
    
    

    @GetMapping("/list")
    public String findAll(Model model) {
        model.addAttribute("books", service.listAllBooks());
        return "list";
    }

    @GetMapping("/add")
    public String lunchAddBookPage(Model model) {
        model.addAttribute("book", new Book());
        return "add_book";
    }

    @PostMapping("/addbook")
    public String registerBook(Book book) {
        service.addBook(book);
        return "redirect:/list";

    }

    @GetMapping("/edit/{id}")
    public String EditBook(Model model, @PathVariable("id") int id) {
        model.addAttribute("book", service.findBook(id));
        return "edit_book";

    }

    @PostMapping("/updatebook")
    public String upadteMyBook(Book book) {
        service.updateBook(book);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteMyBook(@PathVariable("id") int id) {
        service.deleteBook(id);
        return "redirect:/list";
    }

    
    
}
