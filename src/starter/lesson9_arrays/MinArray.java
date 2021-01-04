package starter.lesson9_arrays;

public class MinArray {
    public static void main(String[] args) {
        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 6};

        int min = list[0];

        for(int i = 1; i < list.length; i++){
            if(list[i] < min)
                min = list[i];
        }
        System.out.println("Min is " + min);
    }
}
