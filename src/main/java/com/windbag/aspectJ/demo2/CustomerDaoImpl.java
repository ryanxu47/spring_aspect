package com.windbag.aspectJ.demo2;

/**
 * Created by windbag7 on 2018/9/2.
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户");
    }

    @Override
    public String update() {
        System.out.println("修改客户");
        return "hello";
    }

    @Override
    public void delete() {
        System.out.println("删除客户");
    }

    @Override
    public void findOne() {
        System.out.println("查询一个客户");
        //int a = 1/0;
    }

    @Override
    public void findAll() {
        System.out.println("查询多个客户");
    }
}
