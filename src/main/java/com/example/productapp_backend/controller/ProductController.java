package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{
    @PostMapping("/")
    public String HomePage()
    {
        return "Welcome to Home Page";
    }

    @PostMapping("/add")
    public String Add()
    {
        return "Add product";
    }
}
