package exercise2;

public class TestExercise2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(5);

        System.out.println(c);
        System.out.println("Area: " + c.getArea() + 
        ", perimeter: " + c.getPerimeter());

        System.out.println(r);
         System.out.println("Area: " + r.getArea() + 
        ", perimeter: " + r.getPerimeter());

        System.out.println(s);
         System.out.println("Area: " + s.getArea() + 
        ", perimeter: " + s.getPerimeter());
    }
}
