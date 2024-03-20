package com.erichgamma.api.account;

import lombok.*;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
@ToString(exclude = "id")
public class Account {
    private Long id;
    private String accountNumber;
    private String accountHolder;
    @Setter
    private Double balance;
    @Setter
    private Date transactionDate;
}
