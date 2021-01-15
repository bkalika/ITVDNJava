package professional_renewed.lesson11_xml_xmlparsers.ex002_DOM.XMLParserDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class Main {
     public static void main(String[] args){
         try{
             File xmlFile = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson11_xml_xmlparsers\\ex002_DOM\\XMLParserDOM\\index.xml");

             DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

             DocumentBuilder db = dbf.newDocumentBuilder();

             Document doc = db.parse(xmlFile);

             Element root = doc.getDocumentElement();
             System.out.println("Root element: " + root.getNodeName());
             System.out.println("----------");

             NodeList nl = root.getChildNodes();

             for(int i = 0; i < nl.getLength(); i++){
                 Node node = nl.item(i);

                 if(node.getNodeType() == Node.ELEMENT_NODE){
                     Element element = (Element) node;
                     System.out.println("Book:");
                     System.out.println("Author: " + element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                     System.out.println("Title: " + element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
                     System.out.println("--------------");
                 }
             }
         } catch (ParserConfigurationException | SAXException | IOException e){
             e.printStackTrace();
         }
     }
}
