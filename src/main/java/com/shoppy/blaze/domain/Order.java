package com.shoppy.blaze.domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name= "order")
public class Order {

    @Id
    @Column(name="order_id" ,length=20)
    private String orderId;

    @Column(name="order_date")
    private Timestamp orderDate;

    @Column(name="order_status",length=20)
    private String orderStatus;

    @OneToOne
    @JoinColumn(name="customer_customer_id")
    private Customer customer;

    @ElementCollection
    private Map<Product,Integer> products=new HashMap<Product,Integer>();

    @OneToOne
    @JoinColumn(name = "address_add_id")
    Address address;
}
