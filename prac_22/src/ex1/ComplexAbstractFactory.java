package ex1;

/**
 * ComplexAbstractFactory
 */
public interface ComplexAbstractFactory {

    Complex createComplex();
    Complex createComplex(int real, int image);
}