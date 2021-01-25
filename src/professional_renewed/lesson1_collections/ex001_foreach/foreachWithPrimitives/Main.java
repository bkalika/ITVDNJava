package professional_renewed.lesson1_collections.ex001_foreach.foreachWithPrimitives;

public class Main {
    public static void main(String[] args) {
        int[] x = {2, 5, 6, 7, 8};

        for(int i : x){
            System.out.print(i + " ");
        }

        System.out.println("----");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }

        System.out.println("\n-----");
        for(int j : x){
            ++j;
            System.out.print(j + " ");
        }
    }
}
