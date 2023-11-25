import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rect extends Shape {
    int w, h;

    public Rect(int x, int y, int w, int h, Color color) {
        super(x, y, color, "Rect");
        this.w = w;
        this.h = h;
    }
}
