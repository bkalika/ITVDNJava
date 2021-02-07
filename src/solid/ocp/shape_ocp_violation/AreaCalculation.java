package solid.ocp.shape_ocp_violation;

public class AreaCalculation {
//    public double areaCalc(Rectangle... rectangles){
//        double area = 0;
//
//        for(var rectangle : rectangles){
//            area += rectangle.getHeight() * rectangle.getWidth();
//        }
//        return area;
//    }

    public double areaCalc(Object... shapes){
        double area = 0;

        for(var shape : shapes){
            if (shape instanceof Rectangle){
                Rectangle r = (Rectangle) shape;
                area += r.getHeight() * r.getWidth();
            } else {
                Circle c = (Circle) shape;
                area += Math.pow(c.getRadius(), 2) * Math.PI;
            }
        }
        return area;
    }
}
