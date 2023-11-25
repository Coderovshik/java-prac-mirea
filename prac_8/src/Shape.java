import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract public class Shape {
    String type;
    int x, y;
    Color color;

    public Shape(int x, int y, Color color, String type) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = type;
    }
}