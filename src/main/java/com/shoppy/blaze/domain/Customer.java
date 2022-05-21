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
@Table(name= "customer")
public class Customer {

    @Id@Column(name="customer_id")
    String customerId;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="mobile_numb")
    String mobileNumber;
    @Column(name="email")
    String email;

    @OneToOne
    @JoinColumn(name = "address_add_id")
    Address address;

    @OneToOne
    @JoinColumn(name = "user_user_id")
    User user;

    @OneToOne(mappedBy = "customer")
    Order order;

    @OneToOne(mappedBy = "customer")
    Cart cart;


}
