package professional_renewed.lesson5_strings;

public class SimpleStringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);

        System.out.println(str3);

        String str4 = new StringBuilder().append(2).append(3).toString();
        System.out.println(str4);
        StringBuilder str5 = new StringBuilder().append(4).append(3);
        System.out.println(str5);
    }
}
