package com.service;

import com.repository.BookRepository;

public class BookService {

    private String serviceName;
    private BookRepository bookRepository;

    
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("Service Name: " + serviceName);
        bookRepository.saveBook();
    }
}
