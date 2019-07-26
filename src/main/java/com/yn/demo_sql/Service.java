package com.yn.demo_sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String insert(){
        String sql = "insert into caibin_bill (id, code, name) values (3, '03', 'qq03')";
        String rs = String.valueOf(jdbcTemplate.update(sql));
        return "success";
    }
}
