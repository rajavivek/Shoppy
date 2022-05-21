package com.shoppy.blaze.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="category")
public class Category {

    @Id@Column(name="catid")
    Integer CatId;

    @Column(name="categoryName")
    String categoryName;

    @OneToOne(mappedBy="category")
    Product product;

    @OneToOne(mappedBy = "products")
    Order order;

}
