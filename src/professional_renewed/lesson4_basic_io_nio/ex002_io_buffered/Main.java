package professional_renewed.lesson4_basic_io_nio.ex002_io_buffered;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
                        "E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\ex002_io_buffered\\A.java"), "Cp866"));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
                        "E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\ex002_io_buffered\\out_analog\\A.java"), "Cp866"))
                ){
            int c;
            while((c = br.read()) != -1){
                bw.write((char)c);
            } bw.flush();
            System.out.println("The job's finished");

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
