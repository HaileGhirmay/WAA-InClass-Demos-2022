package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.dto.SimpleProductDto;
import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.repo.ProductRepo;
import edu.miu.springdatademo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product findById(int id) {
        // start conn tx
        var result=  productRepo.findById(id).get();
       // result.setName("aaaaaaaaaa");
        return result;
        // return null;
        // close conn tx
    }

    // LAZY EAGER n+1
    @Override
    public Set<Product> findAll() {
        var result = new HashSet<Product>();
        var data = productRepo.findAll();
        var iterator = data.iterator();
        while (iterator.hasNext()) {
            var p = iterator.next();
            result.add(p);
        }
        return result;
    }

    //    @Override
//    public SimpleProductDto getSimpleDto(int id) {
//        return productRepo.findById(id);
//    }


    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public List<Product> findByPrice(int price) {
        return productRepo.findAllByPriceGreaterThan(price);
    }
}
