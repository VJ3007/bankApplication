package com.app.bankApplication.dao.daoImpl;

import com.app.bankApplication.bean.Customer;
import com.app.bankApplication.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Component
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public String addCustomer(Customer customer) {

        namedParameterJdbcTemplate.update("insert into customer (customerName,phoneNo,gender,email) values(:customerName,:phoneNo,:gender,:email)",
                new MapSqlParameterSource("customerName", customer.getCustomerName())
                        .addValue("phoneNo", customer.getPhoneNo())
                        .addValue("gender", customer.getGender())
                        .addValue("email", customer.getEMail()));

        return "Customer added Successfully";
    }
}
