package exercise2;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        radius = 1.0;
        color = "red";
        filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
        filled = false;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + radius +
            ", color: " + color;
    }
}
