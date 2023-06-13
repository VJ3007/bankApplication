package com.app.bankApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    BankDao bankDao;

    @Override
    public String addBank(Bank bank) {

        return bankDao.addBank(bank);
    }

    @Override
    public String addAddress(Address address) {
        return bankDao.addAddress(address);
    }
}

