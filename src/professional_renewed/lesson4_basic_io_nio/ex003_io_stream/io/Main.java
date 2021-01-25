package professional_renewed.lesson4_basic_io_nio.ex003_io_stream.io;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        try(OutputStream os = new FileOutputStream("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\ex003_io_stream\\io\\test.txt")){
            byte[] bWrite = {11, 31, 3, 34, 12, 77, 1};

            for(int x = 0; x < bWrite.length; x++){
                os.write(bWrite[x]);
            }
            os.flush();

            is = new FileInputStream("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\ex003_io_stream\\io\\test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++){
                System.out.println((char)is.read() + "  ");
                System.out.println(is.read() + " ");
            }

        } catch (IOException e){
            System.out.println("Exception");
        } finally {
            if(is != null){
                is.close();
            }
        }


    }
}
