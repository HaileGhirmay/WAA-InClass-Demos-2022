package edu.miu.springdatademo.repo;

import edu.miu.springdatademo.dto.SimpleProductDto;
import edu.miu.springdatademo.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findAllByPriceGreaterThan(int price);

//    @Query("select p.id as id, p.name as name from Product p where p.id= :id")
//    SimpleProductDto findById(int id);

}
