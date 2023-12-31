package com.app.bankApplication.controller;

import com.app.bankApplication.bean.Customer;
import com.app.bankApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/addCustomer")
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer){

        String status = customerService.addCustomer(customer);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/getCustomer/{customerId}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int customerId){

        Customer customer = customerService.getCustomer(customerId);
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
}
