import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ShapeTest extends JFrame {
    Shape[] shapes;

    public ShapeTest() {
        super("ScoreBoard");

        setSize(640, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        Random random = new Random();
        Color colors[] = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.CYAN };
        shapes = new Shape[20];
        for (int i = 0; i < 20; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0:
                    shapes[i] = new Oval(random.nextInt(640), random.nextInt(360),
                            (int) (random.nextInt(640) / 2) + 1, (int) (random.nextInt(360) / 2) + 1,
                            colors[random.nextInt(colors.length)]);
                    break;
                case 1:
                    int[] xPoints = { random.nextInt(640), random.nextInt(640), random.nextInt(640) };
                    int[] yPoints = { random.nextInt(360), random.nextInt(360), random.nextInt(360) };
                    shapes[i] = new Polygon(xPoints, yPoints, colors[random.nextInt(colors.length)]);
                    break;
                case 2:
                    shapes[i] = new Rect(random.nextInt(640), random.nextInt(360),
                            (int) (random.nextInt(640) / 2) + 1, (int) (random.nextInt(360) / 2) + 1,
                            colors[random.nextInt(colors.length)]);
                    break;
                default:
                    break;
            }
        }

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < 20; i++) {
            Shape s = shapes[i];
            switch (s.type) {
                case "Rect":
                    g.setColor(s.color);
                    g.drawRect(((Rect)s).x, ((Rect)s).y, ((Rect)s).w, ((Rect)s).h);
                    break;
                case "Polygon":
                    g.setColor(s.color);
                    int[] xPoints = { ((Polygon)s).x, ((Polygon)s).x2, ((Polygon)s).x3 };
                    int[] yPoints = { ((Polygon)s).y, ((Polygon)s).y2, ((Polygon)s).y3 };
                    g.drawPolygon(xPoints, yPoints, 3);
                    break;
                case "Oval":
                    g.setColor(s.color);
                    g.drawOval(((Oval)s).x, ((Oval)s).x, ((Oval)s).w, ((Oval)s).h);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new ShapeTest();
    }
}
