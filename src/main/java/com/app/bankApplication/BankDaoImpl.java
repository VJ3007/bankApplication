package com.app.bankApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
@Component
public class BankDaoImpl implements BankDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public synchronized String addBank(Bank bank) {

        namedParameterJdbcTemplate.update("insert into bank (bankName,branch) values(:bankName,:branch)",
                new MapSqlParameterSource("bankName", bank.getBankName())
                        .addValue("branch", bank.getBranch()));



        return "Added Bank Details Successfully";

    }

    @Override
    public String addAddress(Address address, int id) {


        namedParameterJdbcTemplate.update("insert into address (street,city,state,zipCode,id) values(:street,:city,:state,:zipCode,:id)",
                new MapSqlParameterSource("street", address.getStreet())
                        .addValue("city", address.getCity())
                        .addValue("state", address.getState())
                        .addValue("zipCode", address.getZipCode())
                        .addValue("id", id));

        return "Address added Successfully";
    }

    @Override
    public String addAddress(Address address) {

        namedParameterJdbcTemplate.update("insert into address (street,city,state,zipCode,id) values(:street,:city,:state,:zipCode,:id)",
                new MapSqlParameterSource("street", address.getStreet())
                        .addValue("city", address.getCity())
                        .addValue("state", address.getState())
                        .addValue("zipCode", address.getZipCode())
                        .addValue("id",address.getId()));

        return "Address added Successfully";
    }
}
