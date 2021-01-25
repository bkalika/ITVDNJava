package professional_renewed.lesson1_collections.ex001_foreach.foreach;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphynx", 4000);
        Animal dog = new Animal("Malamute", 5000);
        Animal bird = new Animal("Crow", 2000);

        Animal[] c = {cat, dog, bird};
        Animal[] c2 = new Animal[]{cat, dog, bird};

        for (Animal i : c){
            i.price = i.price + 1000;
            System.out.print(i.breed + " - " + i.price + " | ");
        }

        System.out.println("\n");

        for(Animal j : c2){
            System.out.print(j.breed + " - " + j.price + " | ");
        }
    }
}
