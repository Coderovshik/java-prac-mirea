import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(5);
        Ball b2 = new Ball("red");
        Ball b3 = new Ball(5, "red");
        Ball b4 = new Ball();

        System.out.println(b3.toString());

        b1.printVolume();
        b2.printVolume();
        b4.printVolume();
    }
}