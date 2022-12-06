package com.example.productapp_backend.controller;


import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
@Autowired
private ProductDao dao;

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Products p)
    {
        System.out.println(p.getProductName().toString());
        System.out.println(p.getProductcode());
        dao.save(p);
        return "Add product";
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Products> Viewall()
    {
        return (List<Products>) dao.findAll();
    }


}
