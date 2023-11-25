package exercise4;

public class TestExercise4 {
    public static void main(String[] args) {
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        MovableRectangle mr = new MovableRectangle(5, 5, 0, 0, 1, 1);

        System.out.println(mc);
        System.out.println(mr);

        mc.moveRight();
        mr.moveRight();

        System.out.println(mc);
        System.out.println(mr);
    }
}
