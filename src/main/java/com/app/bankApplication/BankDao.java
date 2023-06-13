package com.app.bankApplication;

public interface BankDao {

     String addBank(Bank bank);

     String addAddress(Address address,int id);

     String addAddress(Address address);

}
