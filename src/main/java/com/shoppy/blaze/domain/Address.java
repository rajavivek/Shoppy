package com.shoppy.blaze.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id@Column(name="add_id")
    Integer addressId;

    @Column(name="strt_no")
    String streetNo;

    @Column(name="building_name")
    String buildingName;

    @Column(name="city")
    String city;

    @Column(name="state")
    String state;

    @Column(name="country")
    String country;

    @Column(name="pincode")
    String pincode;

    @OneToOne(mappedBy = "address")
    Customer customer;
}
