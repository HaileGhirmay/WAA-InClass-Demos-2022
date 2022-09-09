package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.repo.ProductRepo;
import edu.miu.springdatademo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public List<Product> findByPrice(int price) {
        return productRepo.findAllByPriceGreaterThan(price);
    }
}
