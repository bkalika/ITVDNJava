package java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1;

import java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1.entity.Ingredient;
import java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1.entity.Sandwich;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SandwichHandler extends DefaultHandler {
    private Sandwich sandwich;
    private String currentQName;
    private int countIngredients;

    public SandwichHandler(){
        sandwich = new Sandwich();
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        System.out.println("Start element: " + qName);
        currentQName = qName;
        countIngredients = (attributes.getLength() > 0) ? Integer.parseInt(attributes.getValue(0)) : 1;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        String value = new String (ch, start, length);
        System.out.println("Characters: " + value);

        switch (currentQName){
            case "title" :
                sandwich.setTitle(value);
                break;
            case "ingredient" :
                for(int i = 0; i < countIngredients; i++){
                    sandwich.addIngredient(new Ingredient(value));
                }
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        System.out.println("End element: " + qName);
        currentQName = "";
    }

    public Sandwich getSandwich(){
        return sandwich;
    }
}
