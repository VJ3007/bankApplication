package com.app.bankApplication.controller;

import com.app.bankApplication.bean.Address;
import com.app.bankApplication.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/addCustomerAddress")
    public ResponseEntity<String> addCustomerAddress(@RequestBody Address address) {

        String status = addressService.addCustomerAddress(address);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping("/addBankAddress")
    public ResponseEntity<String> addBankAddress(@RequestBody Address address) {

        String status = addressService.addBankAddress(address);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    @GetMapping("/getAddress/{addressId}")
    public ResponseEntity<Address> getAddress(@PathVariable int addressId){

        Address address = addressService.getAddress(addressId);
        return new ResponseEntity<>(address,HttpStatus.OK);
    }
}
