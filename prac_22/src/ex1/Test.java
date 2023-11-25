package ex1;

public class Test {
    public static void main(String[] args) {
        Complex concrete = ComplexFactory.getComplex(new ConcreteFactory(), 1, 2);
        System.out.println(concrete);
    }
}
