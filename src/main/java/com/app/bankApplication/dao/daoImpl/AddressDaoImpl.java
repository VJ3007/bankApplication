package com.app.bankApplication.dao.daoImpl;

import com.app.bankApplication.bean.Address;
import com.app.bankApplication.dao.AddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Component
public class AddressDaoImpl implements AddressDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public String addCustomerAddress(Address address) {

        namedParameterJdbcTemplate.update("insert into address (street,city,state,zipCode,customerId) values(:street,:city,:state,:zipCode,:customerId)",
                new MapSqlParameterSource("street", address.getStreet())
                        .addValue("city", address.getCity())
                        .addValue("state", address.getState())
                        .addValue("zipCode", address.getZipCode())
                        .addValue("customerId", address.getCustomerId()));

        return "Address added Successfully";
    }

    @Override
    public String addBankAddress(Address address) {

        namedParameterJdbcTemplate.update("insert into address (street,city,state,zipCode,bankId) values(:street,:city,:state,:zipCode,:bankId)",
                new MapSqlParameterSource("street", address.getStreet())
                        .addValue("city", address.getCity())
                        .addValue("state", address.getState())
                        .addValue("zipCode", address.getZipCode())
                        .addValue("bankId", address.getBankId()));

        return "Address added Successfully";
    }
}
