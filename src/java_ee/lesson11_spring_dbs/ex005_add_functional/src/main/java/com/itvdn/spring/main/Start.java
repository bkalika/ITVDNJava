package com.itvdn.spring.main;

import com.itvdn.spring.dao.impls.SQLiteDAO;
import com.itvdn.spring.dao.objects.Author;
import com.itvdn.spring.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");

        List<MP3> mp3List = sqLiteDAO.getMP3ListByAuthor("evc");

        for(MP3 mp3 : mp3List){
            System.out.println(mp3.getId() + " " + mp3.getName() + " " + mp3.getAuthor().getId() + " " + mp3.getAuthor().getName());
        }


    }
}
