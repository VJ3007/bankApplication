package com.app.bankApplication.service;

import com.app.bankApplication.bean.Address;

public interface AddressService {

    String addCustomerAddress(Address address);

    String addBankAddress(Address address);
}
