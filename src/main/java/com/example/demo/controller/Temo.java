package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Temo {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    @GetMapping("/hell")
    public String sayHell() {
        return "Hello";
    }
    @GetMapping("/say")
    public String say() {
        return "day";
    }
     @GetMapping("/ssay")
    public String ssay() {
        return "daysss";
    }
}
