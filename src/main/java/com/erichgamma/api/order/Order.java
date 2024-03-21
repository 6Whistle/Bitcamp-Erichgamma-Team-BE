package com.erichgamma.api.order;

import java.util.List;

import com.erichgamma.api.product.Product;
import com.erichgamma.api.user.User;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class Order {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;

    @OneToMany(mappedBy = "products")
    @JoinColumn(name = "products_id", referencedColumnName = "id", nullable = true)
    private List<Product> products_id;
}
