package com.app.bankApplication.service.serviceImpl;

import com.app.bankApplication.bean.Address;
import com.app.bankApplication.dao.AddressDao;
import com.app.bankApplication.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDao addressDao;

    @Override
    public String addCustomerAddress(Address address) {
        return addressDao.addCustomerAddress(address);
    }

    @Override
    public String addBankAddress(Address address) {
        return addressDao.addBankAddress(address);
    }

    @Override
    public Address getAddress(int addressId) {
        return addressDao.getAddress(addressId);
    }
}
