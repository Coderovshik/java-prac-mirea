package ex1;
public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Concrete(0);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Concrete(real);
    }
}
