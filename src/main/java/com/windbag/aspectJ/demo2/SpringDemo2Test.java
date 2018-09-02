package com.windbag.aspectJ.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by windbag7 on 2018/9/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2Test {

    @Resource(name="customerDao")
    private CustomerDao customerDao;

    @Test
    public void demo1(){
        customerDao.save();
        customerDao.delete();
        customerDao.findAll();
        customerDao.findOne();
        customerDao.update();
    }
}
