package essential.lesson5_arrays.ex001_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr1;
        int arr2[];
        arr1 = new int[5];
        int[] arr3 = new int[100];

        int[] arr4 = {12, 24, 33, 41, 13, 98};

        System.out.println(arr4.length);

        int[] arr5 = {2, 12, 3, 125, 55, 22};
        int[] arr6 = {56, 78, 23};

        Arrays.sort(arr5);
        System.out.println(arr5);

        System.out.println(Arrays.toString(arr5));

        System.out.println(Arrays.binarySearch(arr5, 12));

        System.out.println(Arrays.equals(arr5, arr6));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 40; i ++){
            arrayList.add(i);
        }
        for(Integer i : arrayList){
            System.out.println(i);
        }
    }
}
