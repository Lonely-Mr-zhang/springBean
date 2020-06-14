package io.github.lonelyMrZhang.service.impl;


//import io.github.lonelyMrZhang.factory.BeanFactory;
import io.github.lonelyMrZhang.service.IAccountService;

/**
 * @description: 该类可能存在jar包中，我们无法通过修改源码的方式使其提供默认构造函数
 * @author: lonely.mr.zhang
 * @date: 2020/6/12 12:44 上午
 */
public class AccountServiceImpl implements IAccountService {

//    public AccountServiceImpl(String temp){
//        System.out.println("创建了AccountServiceImpl对象");
//    }

    public void saveAccount() {
        System.out.println("保存了对象");
    }
}
