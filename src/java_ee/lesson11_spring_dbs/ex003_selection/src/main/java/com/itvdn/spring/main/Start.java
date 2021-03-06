package com.itvdn.spring.main;

import com.itvdn.spring.dao.impls.SQLiteDAO;
import com.itvdn.spring.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        MP3 mp3 = new MP3();
//        mp3.setName("Song #55");
//        mp3.setAuthor("Kalika B");

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");

//        sqLiteDAO.insert(mp3);

        System.out.println(sqLiteDAO.getMP3Count());

        List<MP3> mp3List = sqLiteDAO.getMP3ListByAuthor("lik");
        for(MP3 mp3song : mp3List){
            System.out.println(mp3song.getId() + " " + mp3song.getName() + " " + mp3song.getAuthor());
        }
    }
}
