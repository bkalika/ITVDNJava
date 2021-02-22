package java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1;

import java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1.entity.Ingredient;
import java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1.entity.Sandwich;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SandwichHandler sh = new SandwichHandler();

        File file = new File("E:\\JAVA\\ITVDNJava\\src\\java_ee\\lesson2_jaxp_jaxb\\ex002_SAX_with_object_1\\sendwich.xml");

        if(file.exists()){
            parser.parse(file, sh);

            Sandwich sandwich = sh.getSandwich();

            System.out.println("Sandwich infos: ");
            System.out.println(sandwich.getTitle());

            List<Ingredient> ingredients = sandwich.getIngredients();

            for(Ingredient ingredient : ingredients){
                System.out.println(ingredient.getTitle());
            }
        }
    }
}
