package io.github.lonelyMrZhang.ui;

import io.github.lonelyMrZhang.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @description: 模拟表现层，调用业务层
 * @author: lonely.mr.zhang
 * @date: 2020/6/12 12:53 上午
 */
public class Client {

    /**
     * 核心容器构建的两种方式
     *
     * @param args
     */
    public static void main(String[] args) {

        //1、获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");


        //2、根据id获取对象
        IAccountService accountService = (IAccountService) ac.getBean("accountService");

        System.out.println(accountService);

    }
}
