package professional_renewed.lesson5_strings;

public class SimpleMethodsOfString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!!!";

        long l1 = System.nanoTime();
        String str = str1.concat(str2).concat(str3);
        long l2 = System.nanoTime();
        System.out.println(l2 - l1);

        long l3 = System.nanoTime();
        String str4 = str1 + str2 + str3;
        long l4 = System.nanoTime();
        System.out.println(l4 - l3);

        long l5 = System.nanoTime();
        String str5 = new StringBuilder().append(str1).append(str2).append(str3).toString();
        long l6 = System.nanoTime();
        System.out.println(l6 - l5 );
    }
}
