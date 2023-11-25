package exercise1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(0, 0, 1);
        System.out.println(c.getX() + " " + c.getY() + " " + c.getRadius());

        c.setX(1);
        c.setY(2);
        c.setRadius(3);
        System.out.println(c.getX() + " " + c.getY() + " " + c.getRadius());
    }
}
