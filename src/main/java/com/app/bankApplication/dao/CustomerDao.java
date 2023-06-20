package com.app.bankApplication.dao;

import com.app.bankApplication.bean.Customer;

public interface CustomerDao {

    String addCustomer(Customer customer);

    Customer getCustomer(int customerId);
}
