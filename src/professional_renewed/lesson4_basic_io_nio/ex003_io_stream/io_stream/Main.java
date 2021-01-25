package professional_renewed.lesson4_basic_io_nio.ex003_io_stream.io_stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true)){

                String s = "Hello World";
                System.out.println("System.out puts: " + s);
                pw.println("PrintWriter puts: " + s);

                char c;
                pw.println("Character input: ");
                while((c = (char)br.read()) != 'q'){
                    pw.println(c);
                }

                pw.println("Line input: ");
                do{
                    s = br.readLine();
                    pw.println(s);
                } while(!s.equals("q"));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
