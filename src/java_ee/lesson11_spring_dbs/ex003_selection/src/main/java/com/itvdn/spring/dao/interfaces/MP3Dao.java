package com.itvdn.spring.dao.interfaces;

import com.itvdn.spring.dao.objects.MP3;

import java.util.List;

public interface MP3Dao {
    void insert(MP3 mp3);

    void insert(List<MP3> mp3List);

    void delete(MP3 mp3);

    void delete(int id);

    MP3 getMP3ByID(int id);

    List<MP3> getMP3ListByName(String name);

    List<MP3> getMP3ListByAuthor(String author);

    int getMP3Count();
}
