package professional_renewed.lesson11_xml_xmlparsers.ex003_SAX.SAXParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {
    public static void main(String[] args) {
        final String fileName = "E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\" +
                "lesson11_xml_xmlparsers\\ex002_DOM\\SAXParser\\phonebook.xml";

        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler(){
                boolean name = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes){
                    if (qName.equalsIgnoreCase("name")){
                        name = true;
                    }
                }

                @Override
                public void characters(char ch[], int start, int length) throws SAXException{
                    if (name){
                        System.out.println("Name: " + new String(ch, start, length));
                        name = false;
                    }
                }
            };
            saxParser.parse(fileName, handler);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
