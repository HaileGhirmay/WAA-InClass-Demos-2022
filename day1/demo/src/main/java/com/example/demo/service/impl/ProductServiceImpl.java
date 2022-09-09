package com.example.demo.service.impl;

import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

   // @Autowired
    public ProductServiceImpl(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    @Override
    public void save() {

    }
}
