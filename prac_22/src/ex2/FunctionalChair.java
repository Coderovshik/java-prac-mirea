package ex2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void onSit() {
        System.out.println(sum(2, 2));
    }
}
