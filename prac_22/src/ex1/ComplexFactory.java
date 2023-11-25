package ex1;

public class ComplexFactory {
    public static Complex getComplex(ComplexAbstractFactory factory) {
        return factory.createComplex();
    }

    public static Complex getComplex(ComplexAbstractFactory factory, int real, int image) {
        return factory.createComplex(real, image);
    }
}
