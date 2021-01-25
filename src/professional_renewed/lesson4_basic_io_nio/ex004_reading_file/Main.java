package professional_renewed.lesson4_basic_io_nio.ex004_reading_file;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File f1 = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\ex004_reading_file\\ex.txt");

        BufferedReader br = new BufferedReader(new FileReader(f1));

        String temp;
        while((temp = br.readLine()) != null){
            System.out.println(temp);
        } br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
        pw.println("Good luck");
        pw.flush();
        pw.close();
    }
}
