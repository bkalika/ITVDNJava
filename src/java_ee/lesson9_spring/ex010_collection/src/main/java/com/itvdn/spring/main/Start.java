package com.itvdn.spring.main;

import com.itvdn.spring.impls.pool.T1000Pool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

        T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
        t1000Pool.action();

    }

}
