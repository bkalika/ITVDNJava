package professional_renewed.lesson4_basic_io_nio.simple_byte_array_input_stream;

import java.io.ByteArrayInputStream;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = {1, 3, 5, 6, 8};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int tmp;

        while((tmp = byteArrayInputStream.read()) != -1){
            System.out.println(tmp);
        }

        String str = "Hello";
        byte[] arr2 = str.getBytes();

        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr2);
        int tmp2;
        while ((tmp2 = byteArrayInputStream1.read()) != -1){
            System.out.println((char)tmp2);
        }
    }
}
