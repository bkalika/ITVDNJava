package com.itvdn.spring.main;

import com.itvdn.spring.dao.impls.SQLiteDAO;
import com.itvdn.spring.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        mp3.setName("Song #5");
        mp3.setAuthor("Kalika");

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");

        sqLiteDAO.insert(mp3);
    }
}
