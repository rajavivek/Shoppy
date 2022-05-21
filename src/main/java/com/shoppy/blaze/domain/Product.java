package com.shoppy.blaze.domain;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="product")
public class Product {
    @Id
    @Column(name="prodId")
    String productId;

    @Column(name="product_name",length=20)
    private String productName;

    @Column(name="price")
    private Double price;

    @Column(name="color",length =20)
    private String color;

    @Column(name="dimension",length=20)
    private String dimension;

    @Column(name="specf",length=20)
    private String specification;

    @Column(name="manf",length=20)
    private String manufacturer;

    @Column(name="qty")
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "category_catid")
    Category category;
}
