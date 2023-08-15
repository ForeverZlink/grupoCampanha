package com.grupoCampanha.grupoCampanha.models;


import jakarta.persistence.*;

@Entity
@Table(name="type_of_product")
public class TypeOfProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
}
