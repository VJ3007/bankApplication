package com.app.bankApplication.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    private int bankId;
    private String bankName;
    private String branch;
    private Address address;
}
