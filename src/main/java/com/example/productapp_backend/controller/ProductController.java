package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/search")
    public String Search()
    {
        return "Search product";
    }

    @PostMapping("/edit")
    public String Edit()
    {
        return "Edit product";
    }

    @GetMapping("/products")
    public String Viewall()
    {
        return "View all products";
    }
}
