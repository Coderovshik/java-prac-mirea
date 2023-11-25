import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage extends JFrame {
    private BufferedImage image;

    public DisplayImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setTitle("Display Image");
        setSize(image.getWidth(), image.getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String imagePath = args[0];
            new DisplayImage(imagePath);
        } else {
            System.out.println("Please provide the path to the image as a command line argument.");
        }
    }
}

