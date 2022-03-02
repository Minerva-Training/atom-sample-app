package com.atom.appapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
public class ProductSku {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String sno;

    @Column(nullable = false)
    private Instant addDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
