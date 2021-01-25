package professional_renewed.lesson4_basic_io_nio.simple_buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SimpleBufferedReader{
    public static void main(String[] args) throws IOException{
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//
//        try(BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
//            Integer readLine = Integer.parseInt(bufferedReader.readLine());
//            System.out.println(readLine);
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        // System.in => bytes
        int i = System.in.read();
        System.out.println(i);
        System.out.println((char)i);




    }
}