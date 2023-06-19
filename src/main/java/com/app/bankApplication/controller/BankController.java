package com.app.bankApplication.controller;

import com.app.bankApplication.bean.Bank;
import com.app.bankApplication.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
