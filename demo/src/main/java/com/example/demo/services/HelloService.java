package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    int quantidadeGets = 0;
    int quantidadePosts = 0;
    int quantidadePuts = 0;
    int quantidadeDeletes = 0;

    public Integer quantidadeGets() {
        ++quantidadeGets;
        return quantidadeGets;
    }

    public Integer quantidadePosts() {
        ++quantidadePosts;
        return quantidadePosts;
    }

    public Integer quantidadePuts() {
        ++quantidadePuts;
        return quantidadePuts;
    }

    public Integer quantidadeDeletes() {
        ++quantidadeDeletes;
        return quantidadeDeletes;
    }
}
