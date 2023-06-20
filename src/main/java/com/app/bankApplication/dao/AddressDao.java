package com.app.bankApplication.dao;

import com.app.bankApplication.bean.Address;

public interface AddressDao {

    String addCustomerAddress(Address address);

    String addBankAddress(Address address);

    Address getAddress(int addressId);
}
