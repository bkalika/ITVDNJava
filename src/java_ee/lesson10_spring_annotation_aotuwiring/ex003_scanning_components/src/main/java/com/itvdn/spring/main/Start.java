package com.itvdn.spring.main;

import com.itvdn.spring.impls.pool.T1000Pool;

import com.itvdn.spring.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

        ModelT1000 model1 = (ModelT1000) context.getBean("model1");
        ModelT1000 model2 = (ModelT1000) context.getBean("model2");
        ModelT1000 model3 = (ModelT1000) context.getBean("modelT1000");
        model1.action();
        model2.action();
        model3.action();

    }

}
