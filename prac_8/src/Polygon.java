import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Polygon extends Shape {
    int x2, y2;
    int x3, y3;

    public Polygon(int[] xPoints, int[] yPoints, Color color) {
        super(xPoints[0], yPoints[0], color, "Polygon");
        this.x2 = xPoints[1];
        this.y2 = yPoints[1];
        this.x3 = xPoints[2];
        this.y3 = yPoints[2];
    }
}
