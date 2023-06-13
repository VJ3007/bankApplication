package com.app.bankApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bank")
public class BankController {

    @Autowired
    BankService bankService;

    @PostMapping("/addBank")
    public ResponseEntity<String> addBank(@RequestBody Bank bank) {


        String status = bankService.addBank(bank);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping("/addAddress")
    public ResponseEntity<String> addAddress(@RequestBody Address address) {

        String status = bankService.addAddress(address);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }


}
