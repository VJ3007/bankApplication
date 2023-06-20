package com.app.bankApplication.service;

import com.app.bankApplication.bean.Customer;

public interface CustomerService {

    String addCustomer(Customer customer);

    Customer getCustomer(int customerId);
}
