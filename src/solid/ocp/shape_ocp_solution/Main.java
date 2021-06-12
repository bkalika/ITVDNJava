package solid.ocp.shape_ocp_solution;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 2);
        Rectangle r2 = new Rectangle(8, 9);
        Circle c1 = new Circle(59);

        AreaCalculator ac = new AreaCalculator();
        System.out.println(ac.areaCalc(r1, r2, c1));
    }
}
