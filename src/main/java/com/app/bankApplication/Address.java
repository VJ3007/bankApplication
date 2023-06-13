package com.app.bankApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private int addressId;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private int id;


}
