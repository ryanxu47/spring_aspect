package com.windbag.aspectJ.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by windbag7 on 2018/8/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1Test {

    @Resource(name="productDao")
    private ProductDao productDao;

    @Test
    public void demo1(){
        productDao.delete();
        productDao.findAll();
        productDao.findone();
        productDao.save();
        productDao.update();
    }
}
