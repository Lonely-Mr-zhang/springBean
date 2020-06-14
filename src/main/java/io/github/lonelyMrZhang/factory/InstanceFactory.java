package io.github.lonelyMrZhang.factory;

import io.github.lonelyMrZhang.service.IAccountService;
import io.github.lonelyMrZhang.service.impl.AccountServiceImpl;

/**
 * @description: 模拟工厂类
 * @author: lonely.mr.zhang
 * @date: 2020/6/14 11:11 下午
 */
public class InstanceFactory {

    public IAccountService getAccountService(){
        return  new AccountServiceImpl("");
    }
}
