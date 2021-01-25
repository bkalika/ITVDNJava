package professional_renewed.lesson4_basic_io_nio.simple_random_access_file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try{
            raf = new RandomAccessFile("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson4_basic_io_nio\\simple_random_access_file\\randomText.txt", "rw");
            raf.write(new byte[]{0, 1, 3, 4, 5,6 ,7, 8, 9});
            raf.seek(5);
            raf.write(new byte[]{33, 44, 55});
            raf.seek(0);
            byte[] arr = new byte[10];
            int n = raf.read(arr, 0, 10);
            System.out.println(Arrays.toString(arr));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
