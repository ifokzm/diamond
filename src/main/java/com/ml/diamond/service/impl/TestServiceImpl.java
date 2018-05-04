package com.ml.diamond.service.impl;

import com.ml.diamond.mapper.TestMapper;
import com.ml.diamond.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    TestMapper testMapper;

    @Override
    public void query1() {

    }

    @Override
    public void query2() {

    }
}
