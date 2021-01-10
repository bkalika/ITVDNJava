package professional_renewed.lesson1.ex004_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 17, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);
        Animal animalTest = new Animal("Oriental", 6, 26, 5002);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);

        for(Animal tmp : c){
            System.out.println(tmp.compareTo(animalTest));
            System.out.println("tmp: " + tmp + ". animalTest: " + animalTest);
        }
    }
}
