package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cow originalCow = new Cow("Milka", 12, 1);
        System.out.println("Original caw:" + originalCow);

        Cow copiedCow = reflectionCloning(originalCow);
        System.out.println(copiedCow);

    }

    private static Cow reflectionCloning(Cow originalCow){
        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");

            name.setAccessible(true);
            head.setAccessible(true);

            name.set(originalCow, "Byrenka");
            head.set(originalCow, 2);
        } catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }
        return originalCow;
    }
}
