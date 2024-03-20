package com.erichgamma.api.user;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String job;
    private Double height;
    private Double weight;
}

