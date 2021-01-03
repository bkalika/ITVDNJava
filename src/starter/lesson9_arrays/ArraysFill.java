package starter.lesson9_arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i * 2;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
