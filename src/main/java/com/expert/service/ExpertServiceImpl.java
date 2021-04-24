package com.expert.service;

import com.expert.dao.ExpertDao;
import com.expert.entity.Expert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExpertServiceImpl implements ExpertService{

    private ExpertDao expertDao;

    @Autowired
    public ExpertServiceImpl(ExpertDao expertDao) {
        this.expertDao = expertDao;
    }

    @Override
    public List<Expert> findAll() {
        return expertDao.findAll();
    }
}
