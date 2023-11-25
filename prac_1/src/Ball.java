import java.lang.*;

public class Ball {
    private double radius;
    private String color;

    public Ball(double r, String c) {
        radius = r;
        color = c;
    }

    public Ball(double r) {
        radius = r;
        color = "red";
    }

    public Ball(String c) {
        color = c;
        radius = 1.0;
    }

    public Ball() {
        radius = 1.0;
        color = "red";
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "ball - radius: " + this.radius + ", color: " + this.color;
    }

    public void printVolume() {
        double PI = 3.14;

        System.out.println("volume of ball: " + (this.radius * this.radius * this.radius * PI * 3 / 4));
    }
}