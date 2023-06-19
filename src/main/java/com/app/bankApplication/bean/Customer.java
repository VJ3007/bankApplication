package com.app.bankApplication.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int customerId;
    private String customerName;
    private long phoneNo;
    private String gender;
    private String eMail;
}
