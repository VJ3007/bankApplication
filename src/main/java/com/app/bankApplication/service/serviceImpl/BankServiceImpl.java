package com.app.bankApplication.service.serviceImpl;

import com.app.bankApplication.bean.Bank;
import com.app.bankApplication.dao.BankDao;
import com.app.bankApplication.service.BankService;
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
    public Bank getBank(int id) {
        return bankDao.getBank(id);
    }
}

