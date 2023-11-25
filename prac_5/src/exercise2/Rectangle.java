package exercise2;
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
        color = "red";
        filled = false;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        color = "red";
        filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + width +
        ", length: " + length + ", color: " + color;
    }
}