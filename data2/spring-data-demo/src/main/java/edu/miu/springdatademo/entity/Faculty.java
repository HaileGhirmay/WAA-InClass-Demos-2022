package edu.miu.springdatademo.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@DiscriminatorValue("1")
@Data
@Entity
public class Faculty extends Person{

    private int salary;

}
