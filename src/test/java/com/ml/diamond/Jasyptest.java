package com.ml.diamond;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = DiamondApplication.class)
public class Jasyptest {

    @Autowired
    StringEncryptor encryptor;


    @Test
    public void getPass(){
        String uname = encryptor.encrypt("sa");
        String passwd = encryptor.encrypt("p@ssw0rd");

        System.out.println(uname);
        System.out.println(passwd);
    }
}
