package edu.miu.springdatademo.entity;

import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Product {

    @Id
    private Integer id;

    private String name;


    private String color;

    private int price;

   // @JoinColumn(name = "id_product")
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "product")
    //@BatchSize(size = 2)
   // @Fetch(FetchMode.SELECT)
    private Set<Review> reviews;
}
