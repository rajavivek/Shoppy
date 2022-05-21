package com.shoppy.blaze.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name= "cart")
public class Cart {

    @Id
    @Column(name="cartId")
    private String cartId;

    @OneToOne
    @JoinColumn(name = "customer_customer_id")
    private Customer customer;

    @ElementCollection
    private Map<Product,Integer> products=new HashMap<Product,Integer>();
}
