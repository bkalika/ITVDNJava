package com.itvdn.json.ex001_json.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itvdn.json.ex001_json.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person =  null;

        try {
            person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(person);

        System.out.println(person.getFirstName());
    }
}
