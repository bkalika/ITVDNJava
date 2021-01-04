package starter.lesson9_arrays;

import java.util.Arrays;

public class MethodsSameValues {
    public static int[] randomArray(int count){
        int arr[] = new int[count];
        arr = new int[]{7, 2, 2, 4, 4, 5, 2, 3, 7, 9, 6, 8, 8, 7, 9, 4};
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = (int) (Math.random() * 10);
//        }
        return arr;
    }

    public static void minValue(int arr[]){
        System.out.println(Arrays.toString(arr));
        int minValue = arr[0];
        int[] minValueArray = new int[arr.length];
        int counter = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == minValue){
                minValueArray[i] = arr[i];
                ++counter;
            }
        }

        System.out.println(minValue);
        System.out.println(Arrays.toString(minValueArray));
        System.out.println(counter);

        int[] newMinArray = new int[counter];
        if (counter == 3){
            for (int i = 0; i < newMinArray.length; i++){
                newMinArray[i] = minValue;
            }
            System.out.println(Arrays.toString(newMinArray));
        }
    }

    public static void main(String[] args) {
        minValue(randomArray(17));
    }
}
