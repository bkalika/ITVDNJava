package professional_renewed.lesson1_collections.ex005_comparator.interface_comparator_with_anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 17, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};

        System.out.println("Sorted by price:");
        Arrays.sort(c, new Comparator<Animal>(){
            public int compare(Animal o1, Animal o2){
                return o1.price - o2.price;
            }
        });
        for(Animal tmp : c){
            System.out.println(tmp);
        }

        System.out.println("\nSorted by weight:");

        Arrays.sort(c, new Comparator<Animal>(){
            public int compare(Animal o1, Animal o2){
                return o1.weight - o2.weight;
            }
        });

        for (Animal tmp : c){
            System.out.println(tmp);
        }

        System.out.println("\nSorted by price:");

        Arrays.sort(c, new Comparator<Animal>(){
            public int compare(Animal o1, Animal o2){
                return o1.price - o2.price;
            }
        });

        for(Animal tmp : c){
            System.out.println(tmp);
        }

        System.out.println("\nSorted by breed:");

        Arrays.sort(c, new Comparator<Animal>(){
            public int compare(Animal o1, Animal o2){
                return o1.breed.compareTo(o2.breed);
            }
        });

        for (Animal tmp : c){
            System.out.println(tmp);
        }

    }
}
