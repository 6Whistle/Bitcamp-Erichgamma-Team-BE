package com.erichgamma.api.user;

import jakarta.persistence.*;
import lombok.*;
@Entity(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class User {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String job;
    private Double height;
    private Double weight;
}

