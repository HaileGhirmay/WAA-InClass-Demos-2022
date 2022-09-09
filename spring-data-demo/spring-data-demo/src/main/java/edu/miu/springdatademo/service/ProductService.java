package edu.miu.springdatademo.service;

import edu.miu.springdatademo.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product p);

    List<Product> findByPrice(int price);

}
