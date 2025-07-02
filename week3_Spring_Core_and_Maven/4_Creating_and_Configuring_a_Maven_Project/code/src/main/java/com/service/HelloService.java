package com.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public void sayHello() {
        System.out.println("Hello, Spring!");
    }
}
