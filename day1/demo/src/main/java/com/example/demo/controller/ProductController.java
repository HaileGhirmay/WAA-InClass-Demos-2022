package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

//@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

}
