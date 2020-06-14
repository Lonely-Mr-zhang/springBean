package io.github.lonelyMrZhang.service.impl;


//import io.github.lonelyMrZhang.factory.BeanFactory;
import io.github.lonelyMrZhang.service.IAccountService;

/**
 * @description:
 * @author: lonely.mr.zhang
 * @date: 2020/6/12 12:44 上午
 */
public class AccountServiceImpl implements IAccountService {



    AccountServiceImpl(String temp){
        System.out.println("创建对象了");
    }

    public void saveAccount() {
        System.out.println("保存了对象");
    }
}
