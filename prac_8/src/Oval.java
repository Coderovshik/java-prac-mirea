import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Oval extends Shape {
    int w, h;

    public Oval(int x, int y, int w, int h, Color color) {
        super(x, y, color, "Oval");
        this.w = w;
        this.h = h;
    }
}
