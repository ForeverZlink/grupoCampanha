package com.grupoCampanha.grupoCampanha.models;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name="product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,nullable = false)
    private String SapCode;

    @Column(unique = true,nullable = false)
    private String name;
    private String description;
    @ManyToOne()
    private TypeOfProductModel typeOfProductModel;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateOfRegisterProduct;
    private double actualPrice;
    @ManyToOne()
    private UnitOfMeasurementModel unitOfMeasurementModel;
    @OneToMany(mappedBy = "productModel"   )
    private List<AllPricesOfSoldAProduct> allPricesOfAProductList;
    private double quantityAvailableToSell;
}
