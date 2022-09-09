package edu.miu.springdatademo.entity;

import lombok.Data;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.List;

@Data
@Entity
@Table(name = "my_products")
public class Product {

    @Id
    private int id;
    @Column(name = "product_name")
    private String name;

    @Column(name = "product_color")
    private String color;

    private int price;


    @ManyToMany(mappedBy = "products")
    private List<Review> reviews;

}
