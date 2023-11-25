package ex2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Magic!");
    }

    public void onSit() {
        doMagic();
    }
}
