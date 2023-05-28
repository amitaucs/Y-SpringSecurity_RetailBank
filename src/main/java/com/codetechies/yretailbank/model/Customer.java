package com.codetechies.yretailbank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name = "email")
    private String email;
    @Column(name = "pwd")
    private String password;
    @Column(name = "role")
    private String role;

}
