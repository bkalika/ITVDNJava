package professional_renewed.lesson4_basic_io_nio.simple_data_input_stream;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("E:" +
                "\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\simple_data_input_stream\\data_out.txt")));
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("E:" +
                    "\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\simple_data_input_stream\\data_out.txt")));
            ){
            out.writeShort(1000);
            out.writeInt(1111);
            out.writeLong(2000L);
            out.writeUTF("Hello World");

            out.flush();

            System.out.println(in.readShort());
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readUTF());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
