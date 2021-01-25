package professional_renewed.lesson1_collections.ex003_sorting.sorting_arrays;

import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String[] students = {"Alex", "Ivan", "Bohdan", "Taras", "Max"};

        Arrays.sort(marks);
        Arrays.sort(students);

        for(int tmp : marks){
            System.out.println(tmp + " ");
        }
        System.out.println();

        for(String tmp : students){
            System.out.println(tmp + "");
        }
    }
}
