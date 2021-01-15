package com.itvdn.json.ex003_jackson.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itvdn.json.ex003_jackson.entity.CurrencyRate;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();


        CurrencyRate[] currencyRates = objectMapper.readValue(new URL(url), CurrencyRate[].class);

        for(CurrencyRate currencyRate : currencyRates){
            System.out.println(currencyRate);
        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                                        .writeValueAsString(currencyRates);

        Files.write(Paths.get("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson12_json\\ex001_maven\\src\\main\\resources\\jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
