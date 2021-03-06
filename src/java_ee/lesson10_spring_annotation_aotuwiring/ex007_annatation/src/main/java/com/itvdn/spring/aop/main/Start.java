package com.itvdn.spring.aop.main;

import com.itvdn.spring.aop.objects.FileManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        String folderPath = "c:\\Windows\\System32";
        String folderPath2 = "c:\\Windows";

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        FileManager fileUtil = (FileManager) context.getBean("fileManager");
        fileUtil.getExtensionCount(folderPath);
        fileUtil.getExtensionCount(folderPath2);

        fileUtil.getExtensionList(folderPath);
        fileUtil.getExtensionList(folderPath2);
    }
}
