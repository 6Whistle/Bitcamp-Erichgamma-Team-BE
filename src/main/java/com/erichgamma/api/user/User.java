package com.erichgamma.api.user;

<<<<<<< HEAD
<<<<<<< HEAD
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "users")
=======
import jakarta.persistence.*;
import lombok.*;

@Entity(name="users")
>>>>>>> dev-shc
=======
import jakarta.persistence.*;
import lombok.*;

>>>>>>> 44ec7153c547d235fc02aaf309c092e530ac8b0c
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity(name = "users")
@ToString(exclude = "id")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
=======

>>>>>>> dev-shc
    private Long id;
    private Long addressId;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String job;
    private Double height;
    private Double weight;
}

