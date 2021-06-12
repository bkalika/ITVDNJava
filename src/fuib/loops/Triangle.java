//package fuib.loops;
//import java.math.*;
//
//public class Triangle {
//    public static void main(String[] args) {
//        System.out.println("Christmas Tree:");
//        christmasTree(20);
//        System.out.println("Fibonacci:");
//        fibonacci(20);
//        simpleNumber(100);
//    }
//
//    public static void christmasTree(int size){
//        for(int i = 0; i < size; ++i){
//            System.out.print(" ".repeat(size-i) + "*".repeat(i));
//            System.out.println("*".repeat(1+i));
//        }
//        System.out.println(" ".repeat(size) + "*");
//        System.out.println(" ".repeat(size) + "*");
//    }
//
//    public static void fibonacci(long countNumber){
//        long previousValue = 0;
//        long currentValue = 1;
//        int counter = 0;
//        System.out.println(0);
//        while(counter<countNumber){
//            counter++;
//            currentValue += previousValue;
//            previousValue += currentValue;
//            System.out.println(currentValue + "\n" + previousValue);
//        }
//    }
//
//    public static void simpleNumber(int maxValue){
//        int arr[] = new int[maxValue];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = i;
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] < 1){
//                arr[i] = -1;
//            }
//            else if(arr[i] < 3){
//                arr[i] = -1;
//            }
//            else if(arr[i] % 2 == 0 || arr[i] % 3 == 0){
//                arr[i] = -1;
//            }
//            int n = 5;
//            while (n*n <= arr[i]){
//                if(arr[i] % n == 0 || arr[i] % (n %2) == 0){
//                    arr[i] = -1;
//                }
//                n = n+6;
//            }
//        }
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] != -1){
//                System.out.print(arr[i] + ", ");
//            }
//        }
//    }
//}
