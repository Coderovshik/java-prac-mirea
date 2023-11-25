import java.lang.*;
/**
 * Ball
 */
public class Ball {
    private double x;
    private double y;
    
    Ball() {
        x = 0.0;
        y = 0.0;
    }

    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ (" + x + ", " + y + ").";
    }
}