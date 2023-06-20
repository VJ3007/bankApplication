package com.app.bankApplication.controller;

import com.app.bankApplication.bean.Bank;
import com.app.bankApplication.service.BankService;
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
    @GetMapping("/getBank/{id}")
    public ResponseEntity<Bank> getBank(@PathVariable int id){

        Bank bank = bankService.getBank(id);
        return new ResponseEntity<>(bank,HttpStatus.OK);
    }
}
