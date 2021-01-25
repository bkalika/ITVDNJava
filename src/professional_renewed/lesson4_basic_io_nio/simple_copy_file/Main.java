package professional_renewed.lesson4_basic_io_nio.simple_copy_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\simple_copy_file\\file.txt");
        File targetFile = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\simple_copy_file\\file_copy.txt");

        try{
            Files.copy(sourceFile.toPath(), targetFile.toPath());
//            Files.move(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
