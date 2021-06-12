package patterns.decorator.objects;

public class Button implements Component {

    @Override
    public void draw() {
        System.out.println("Draw button");
    }
}
