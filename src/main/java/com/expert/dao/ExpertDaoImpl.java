package com.expert.dao;

import com.expert.entity.Expert;
import com.expert.mapper.ExpertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ExpertDaoImpl implements ExpertDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ExpertDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Expert> findAll() {
        //todo тут запрос всех юзеров + джоин проекты имя и ид
        String sql = "select * from public.\"Expert\"";
        return jdbcTemplate.query(sql,new ExpertMapper());
    }
}
