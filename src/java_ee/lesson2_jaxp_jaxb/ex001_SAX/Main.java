package java_ee.lesson2_jaxp_jaxb.ex001_SAX;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        File file = new File("E:\\JAVA\\ITVDNJava\\src\\java_ee\\lesson2_jaxp_jaxb\\ex001_SAX\\country.xml");

        if(file.exists())
            parser.parse(file, new MyHandler());
    }
}
