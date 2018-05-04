package com.ml.diamond;

import com.ml.diamond.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = DiamondApplication.class)
public class DataSourceTest {


    @Autowired
    TestMapper testMapper;

    @Test
    public void test(){
        System.out.println(testMapper.query());
        System.out.println(testMapper.query2());
    }

}
