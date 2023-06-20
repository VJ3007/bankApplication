package com.app.bankApplication.dao.daoImpl;

import com.app.bankApplication.bean.Bank;
import com.app.bankApplication.dao.BankDao;
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
    public Bank getBank(int id) {
        Map<String, Integer> map = new HashMap<>();

        map.put("id", id);
        return namedParameterJdbcTemplate.queryForObject("select * from bank where id= :id", map, bankRowMapper());
    }

    private RowMapper<Bank> bankRowMapper() {
        return (resultSet, rowNum) -> {
            Bank bank = new Bank();
            bank.setBankId(resultSet.getInt("id"));
            bank.setBankName(resultSet.getString("bankName"));
            bank.setBranch(resultSet.getString("branch"));
            return bank;
        };
    }
}
