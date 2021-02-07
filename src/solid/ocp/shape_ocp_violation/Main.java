package solid.ocp.shape_ocp_violation;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 3);
        Rectangle r2 = new Rectangle(5, 8);
        Circle c1 = new Circle(5);

        var ac = new AreaCalculation();

        System.out.println(ac.areaCalc(r1, r2, c1));
    }
}
