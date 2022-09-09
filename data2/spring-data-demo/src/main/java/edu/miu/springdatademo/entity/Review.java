package edu.miu.springdatademo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Review {

    @Id
    private int id;
    private String comment;


    @ManyToOne
    private Product product;
}
