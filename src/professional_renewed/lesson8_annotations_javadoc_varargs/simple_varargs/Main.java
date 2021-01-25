package professional_renewed.lesson8_annotations_javadoc_varargs.simple_varargs;

public class Main {
    private int calcSum(int i, int... values){
        int result = 0;
        for(int tmp : values){
            result += i;
        }
        return 10;
    }

    private int calcSum(short s, String... values){
        return 5;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.calcSum(1, 2, 4));
        System.out.println(m.calcSum(4, 3));
//        System.out.println(m.calcSum());

    }
}
