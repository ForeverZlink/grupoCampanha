package com.grupoCampanha.grupoCampanha.models;

import jakarta.persistence.*;

@Entity
public class AllPricesOfSoldAProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne()
    private ProductModel productModel;
    private double price;

}
