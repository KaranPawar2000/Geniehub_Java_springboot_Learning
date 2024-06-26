package com.karan.spring_sec_demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="users")   //if table name in data base is different from class name then mention table name.
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
}
