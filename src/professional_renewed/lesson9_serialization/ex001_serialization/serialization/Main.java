package professional_renewed.lesson9_serialization.ex001_serialization.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("E:\\JAVA\\ITVDNJava\\src\\professional_renewed\\lesson9_serialization\\ex001_serialization\\serialization\\output.txt");
        Car c = new Car(5000, "BMW");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))
        ){
            oos.writeObject(c);

            Car car = (Car) ois.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
