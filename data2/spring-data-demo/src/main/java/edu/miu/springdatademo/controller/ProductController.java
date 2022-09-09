package edu.miu.springdatademo.controller;

import edu.miu.springdatademo.dto.SimpleProductDto;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Set<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
        //    return null;
    }

    @GetMapping("/{id}/simple")
    public SimpleProductDto getSimpleDto(@PathVariable int id) {
        //      return productService.getSimpleDto(id);
        return null;
    }

}
