package professional_renewed.lesson9_serialization.simple.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Bohdan");

        File f = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson9_serialization\\simple\\serialization\\output.txt");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))
        ){
            outputStream.writeObject(student);
            student = null;
            student = (Student)inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
