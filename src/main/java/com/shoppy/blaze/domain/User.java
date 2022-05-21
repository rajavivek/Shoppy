package com.shoppy.blaze.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity@Table(name="user")
public class User {
    @Id@Column(name="user_id")
    String userId;
    @Column(name="password")
    String password;
    @Column(name="role")
    String role;

    @OneToOne(mappedBy="user")
    Customer customer;
}
