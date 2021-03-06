package com.itvdn.spring.main;

import com.itvdn.spring.dao.impls.SQLiteDAO;
import com.itvdn.spring.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        MP3 firstMP3 = new MP3();
        firstMP3.setName("Song #4");
        firstMP3.setAuthor("Big Boss");

        MP3 secondMP3 = new MP3();
        secondMP3.setName("Song #15");
        secondMP3.setAuthor("Huge");

        List<MP3> list = new ArrayList<MP3>();

        list.add(firstMP3);
        list.add(secondMP3);

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");

        MP3 mp3 = new MP3();
        mp3.setName("New song");
        mp3.setAuthor("Author");

        sqLiteDAO.insert(mp3);

//        System.out.println(sqLiteDAO.insertList(list));
    }
}
