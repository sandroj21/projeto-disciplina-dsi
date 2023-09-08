package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World!!!";
    }

    @PostMapping("/hello")
    public String postHelloPost1(){
        return "Hello World Post";
    }

    @PutMapping("/hello")
    public String postHelloPost2(){
        return "Hello World Put";
    }

    @DeleteMapping("/hello")
    public String postHelloPost3(){
        return "Hello World Delet";
    }
}