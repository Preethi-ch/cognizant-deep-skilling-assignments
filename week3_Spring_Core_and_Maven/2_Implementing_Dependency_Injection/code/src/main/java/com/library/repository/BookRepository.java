package com.library.repository;


public class BookRepository {
    public BookRepository() {
        System.out.println("BookRepository created");
    }
    public void addBook(String bookName) {
        System.out.println("Book added to repository: " + bookName);
    }
}
