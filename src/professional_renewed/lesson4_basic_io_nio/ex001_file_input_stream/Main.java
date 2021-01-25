package professional_renewed.lesson4_basic_io_nio.ex001_file_input_stream;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true)){
            File f = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\ex001_file_input_stream\\A.java");
            pw.println();
            pw.println("File \"" + f.getName() + (f.exists() ? "" : " not") + " exists");
            pw.println("You " + (f.canRead() ? "" : " can not") + " read this file");
            pw.println("You " + (f.canWrite() ? "" : " can not") + " write this file");
            pw.println("The length of this file " + f.length() + " b");
            pw.println();

            File d = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed");
            pw.println("Contains of the catalog: ");
            if(d.exists() && d.isDirectory()){
                String[] s = d.list();
                for (int i = 0; i < s.length; i++){
                    pw.println(s[i]);
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
