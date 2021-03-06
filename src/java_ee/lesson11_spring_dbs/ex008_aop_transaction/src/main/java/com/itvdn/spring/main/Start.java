package com.itvdn.spring.main;

import com.itvdn.spring.dao.impls.SQLiteDAO;
import com.itvdn.spring.dao.objects.Author;
import com.itvdn.spring.dao.objects.MP3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        MP3 firstMP3 = new MP3();
        firstMP3.setName("Song #69");

        Author author = new Author();

        author.setName("Jesica");
        firstMP3.setAuthor(author);

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");

        System.out.println(sqLiteDAO.insert(firstMP3));


    }
}
