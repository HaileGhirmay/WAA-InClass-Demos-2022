package edu.miu.springdatademo.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@DiscriminatorValue("2")
@Data
@Entity
public class Student  extends Person{

    private float gpa;
}
