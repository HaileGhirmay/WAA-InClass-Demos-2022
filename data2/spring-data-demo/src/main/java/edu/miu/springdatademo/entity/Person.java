package edu.miu.springdatademo.entity;

import lombok.Data;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.INTEGER)

@Data
@Entity
public class Person {

    @Id
    private int personId;

    private String email;
    private String password;
}
