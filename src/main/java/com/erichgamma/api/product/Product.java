package com.erichgamma.api.product;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class Product {
    private Long id;
    private String name;
    private String company;
    private Integer price;
}
