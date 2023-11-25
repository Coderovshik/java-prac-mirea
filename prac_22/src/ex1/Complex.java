package ex1;
/**
 * Complex
 */
public abstract class Complex {

    public abstract int getReal();
    public abstract int getImage();

    @Override
    public String toString() {
        return "Complex: " + this.getReal() + ", " + this.getImage();
    }
}