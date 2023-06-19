package com.app.bankApplication.service.serviceImpl;

import com.app.bankApplication.bean.Customer;
import com.app.bankApplication.dao.CustomerDao;
import com.app.bankApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public String addCustomer(Customer customer) {
        return customerDao.addCustomer(customer);
    }
}
