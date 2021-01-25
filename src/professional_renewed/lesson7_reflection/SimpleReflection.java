package professional_renewed.lesson7_reflection;

import java.util.Map;

public class SimpleReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. getClass();
        SimpleReflection simpleReflection = new SimpleReflection();
        Class<?> cl = simpleReflection.getClass();

        int[] arr = new int[10];
        Class<?> cl2 = arr.getClass();
        Class<?> cl3 = "world".getClass();
        Class<?> cl4 = Integer.valueOf(5).getClass();

        System.out.println(cl);
        System.out.println(cl2);
        System.out.println(cl3);
        System.out.println(cl4);

        // 2. String.class
        Class<?> cl5 = SimpleReflection.class;
        Class<?> cl6 = int[].class;
        System.out.println(cl5);
        System.out.println(cl6);

        // 3. Class.forName()
        Class<?> cl7 = Class.forName("java.lang.String");
        System.out.println(cl7);

        Class<?> cl8 = Class.forName("[I");
        Class<?> cl9 = Class.forName("[D");
        System.out.println(cl8);
        System.out.println(cl9);

        // 4.
        Class<?> cl10 = Integer.class.getSuperclass();
        System.out.println(cl10);
        Class<?> cl11 = Map.Entry.class.getEnclosingClass();
        System.out.println(cl11);
    }
}
