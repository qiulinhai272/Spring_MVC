package com.itheima.dao.impl;

import com.itheima.dao.UploadDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class UploadDaoImpl implements UploadDao {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
