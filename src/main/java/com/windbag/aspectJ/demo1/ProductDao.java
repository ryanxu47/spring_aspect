package com.windbag.aspectJ.demo1;

/**
 * Created by windbag7 on 2018/8/31.
 */
public class ProductDao {

    public void save(){
        System.out.println("保存商品");
    }

    public String update(){
        System.out.println("更改商品");
        return "hello";
    }

    public void findone(){
        System.out.println("查询一个商品");
        //int i = 1/0;
    }

    public void delete(){
        System.out.println("删除商品");
    }

    public void findAll(){
        System.out.println("查询所有商品");
    }
}
