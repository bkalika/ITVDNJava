package essential.nazar_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nazar {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("We are reading this line:");
        System.out.println(s);
    }

}
