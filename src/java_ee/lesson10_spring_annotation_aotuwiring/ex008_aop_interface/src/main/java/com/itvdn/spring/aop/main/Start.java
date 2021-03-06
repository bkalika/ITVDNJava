package com.itvdn.spring.aop.main;

import com.itvdn.spring.aop.objects.FileManager;
import com.itvdn.spring.aop.objects.FileManager2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        String folderPath = "c:\\Windows\\System32";
        String folderPath2 = "c:\\Windows";

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        FileManager fileManger = (FileManager) context.getBean("fileManager");
        FileManager2 fileManger2 = (FileManager2) context.getBean("fileManager2");

        context.getBean("fileManager2");

        fileManger.getExtensionCount(folderPath);
        fileManger.getExtensionCount(folderPath2);

        fileManger.getExtensionList(folderPath);
        fileManger.getExtensionList(folderPath2);

        fileManger2.getExtensionCount(folderPath2);
        fileManger2.getExtensionCount(folderPath);
    }
}
