import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Animation extends JFrame {
    private BufferedImage[] frames;
    private int currentFrameIndex;
    private Timer timer;

    public Animation(String[] framePaths, int delay) {
        frames = new BufferedImage[framePaths.length];
        
        for (int i = 0; i < framePaths.length; i++) {
            try {
                frames[i] = ImageIO.read(new File(framePaths[i]));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        currentFrameIndex = 0;

        setTitle("Animation");
        setSize(frames[0].getWidth(), frames[0].getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        timer = new Timer(delay, e -> {
            currentFrameIndex = (currentFrameIndex + 1) % framePaths.length;
            repaint();
        });
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(frames[currentFrameIndex], 0, 0, null);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int delay = 100; // Задержка между кадрами (в миллисекундах)
            new Animation(args, delay);
        } else {
            System.out.println("Please provide the paths to the frames as command line arguments.");
        }
    }
}
