package com.atom.appapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer available;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToMany(mappedBy = "products")
    private Set<ProductCategory> categories;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Set<ProductSku> skus;

}
