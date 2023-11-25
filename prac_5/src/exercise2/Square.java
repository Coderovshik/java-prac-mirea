package exercise2;
public class Square extends Rectangle {
    public Square() {
        width = length = 1.0;
        color = "red";
        filled = false;
    }

    public Square(double side) {
        width = length = side;
        color = "red";
        filled = false;
    }

    public Square(double side, String color, boolean filled) {
        width = length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = length = side;
    }

    @Override
    public void setWidth(double side) {
        width = length = side;
    }

    @Override
    public void setLength(double side) {
        width = length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + width +
            ", color: " + color;
    }
}