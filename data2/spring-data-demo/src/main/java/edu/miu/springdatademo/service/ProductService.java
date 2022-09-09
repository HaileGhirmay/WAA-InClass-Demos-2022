package edu.miu.springdatademo.service;

import edu.miu.springdatademo.dto.SimpleProductDto;
import edu.miu.springdatademo.entity.Product;

import java.util.List;
import java.util.Set;

public interface ProductService {

    void save(Product p);

    List<Product> findByPrice(int price);

    Product findById(int id);

    Set<Product> findAll();

  //  SimpleProductDto getSimpleDto(int id);
}
