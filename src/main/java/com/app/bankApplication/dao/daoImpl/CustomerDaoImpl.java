package com.app.bankApplication.dao.daoImpl;

import com.app.bankApplication.bean.Customer;
import com.app.bankApplication.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    public Customer getCustomer(int customerId) {

        Map<String, Integer> map = new HashMap<>();
        map.put("customerId", customerId);

        return namedParameterJdbcTemplate.queryForObject("select * from customer where customerId = :customerId", map, customerRowMapper());
    }

    private RowMapper<Customer> customerRowMapper() {

        return (resultSet, rowNum) -> {
            Customer customer = new Customer();
            customer.setCustomerId(resultSet.getInt("customerId"));
            customer.setCustomerName(resultSet.getString("customerName"));
            customer.setGender(resultSet.getString("gender"));
            customer.setPhoneNo(resultSet.getLong("phoneNo"));
            customer.setEMail(resultSet.getString("email"));
            return customer;
        };
    }
}
