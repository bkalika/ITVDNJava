package professional_renewed.lesson4_basic_io_nio.simple_err;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args) {
        try{
            InputStream inputStream = new FileInputStream("D");
            System.out.println("File opened");
        } catch (FileNotFoundException e){
            System.err.println("File opened failed");
            e.printStackTrace();
        }

    }
}
