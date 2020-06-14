package io.github.lonelyMrZhang.factory;

import io.github.lonelyMrZhang.service.IAccountService;
import io.github.lonelyMrZhang.service.impl.AccountServiceImpl;

/**
 * @description: 通过静态方法创建对象的工厂类
 * @author: lonely.mr.zhang
 * @date: 2020/6/15 12:00 上午
 */
public class StaticFactory {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl("");
    }
}
