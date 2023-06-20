package com.app.bankApplication.dao;

import com.app.bankApplication.bean.Bank;

public interface BankDao {

    String addBank(Bank bank);

    Bank getBank(int id);
}
