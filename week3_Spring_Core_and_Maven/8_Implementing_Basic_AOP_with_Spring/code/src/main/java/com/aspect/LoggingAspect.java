package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.service.BookService.addBook(..))")
    public void beforeAddBook() {
        System.out.println("[LOG] ==> Before executing addBook()");
    }

    @After("execution(* com.service.BookService.addBook(..))")
    public void afterAddBook() {
        System.out.println("[LOG] ==> After executing addBook()");
    }
}
