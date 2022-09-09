package edu.miu.springdatademo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Review {

    @Id
    private int id;
    private String comment;

    @ManyToMany
    private List<Product> products;

}
