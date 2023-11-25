package ex1;

public class Concrete extends Complex {
    private int real;
    private int image;

    public Concrete(int real) {
        this.real = real > 0 ? real : 0;
        this.image = 0;
    }

    @Override
    public int getReal() {
        return this.real;
    }

    @Override
    public int getImage() {
        return this.image;
    }
}
