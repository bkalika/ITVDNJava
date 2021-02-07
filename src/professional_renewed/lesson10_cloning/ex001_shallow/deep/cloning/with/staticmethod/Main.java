package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.staticmethod;

public class Main {
    public static void main(String[] args) {
        Human cloneHuman = Human.getHumanInstanceWithAgeAndString(24, "Bohdan");
        System.out.println(cloneHuman);

        // 2nd example
        Car car = new Car(2500, "BMW");
        System.out.println("Original car = " + car);

        Car copiedCar = Car.deepCopyCar(car);
        System.out.println(copiedCar);
    }
}
