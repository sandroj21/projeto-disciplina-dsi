package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.HelloService;

@RestController
public class Hello {

    @Autowired
    public HelloService helloService;
    

    @GetMapping("/hello")
    public String getHelloWorld(){
        String r = "Hello World Get: " + helloService.quantidadeGets() + "\nHello World Post: " + helloService.quantidadePosts();
        return r;
    }

    @PostMapping("/hello")
    public String postHelloPost1(){
        String r = "Hello World Post: " + helloService.quantidadePosts();
        return r;
    }

    @PutMapping("/hello")
    public String postHelloPost2(){
        String r = "Hello World Put: " + helloService.quantidadePuts();
        return r;
    }

    @DeleteMapping("/hello")
    public String postHelloPost3(){
        String r = "Hello World Delete: " + helloService.quantidadeDeletes();
        return r;
    }
}