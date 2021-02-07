package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Cow byrenka = new Cow("Byrenka", 6, 1200);

        ByteArrayOutputStream byteOutput = null;
        ByteArrayInputStream byteInput = null;

        ObjectOutputStream output = null;
        ObjectInputStream input = null;

        try {
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(byrenka);

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);

            Cow cloneByrenka = (Cow) input.readObject();

            cloneByrenka.setWeight(500);

            System.out.println(byrenka);
            System.out.println(cloneByrenka);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (byteOutput != null) {
                try {
                    byteOutput.flush();
                    byteOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteInput != null) {
                try {
                    byteInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
