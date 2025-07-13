package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor Injection executed");
        this.bookRepository = bookRepository;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection executed");
        this.bookRepository = bookRepository;
    }

    public void showBestseller() {
        System.out.println("Bestselling Book: " + bookRepository.getBestseller());
    }
}
