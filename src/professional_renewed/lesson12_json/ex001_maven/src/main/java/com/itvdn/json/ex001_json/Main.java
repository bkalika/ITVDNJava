package com.itvdn.json.ex001_json;

import com.itvdn.json.ex001_json.parser.JacksonDataBind;

public class Main {
    public static void main(String[] args) {
        JacksonDataBind.parseJson("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson12_json\\" +
                "ex001_maven\\src\\main\\resources\\person.json");
    }
}
