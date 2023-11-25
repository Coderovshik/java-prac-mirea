package ex2;

public class Test {
    public static void main(String[] args) {
        ChairFactory cf = new ChairFactory();
        Client c = new Client();
        c.setChair(cf.createVictorianChair());
        c.sit();
        c.setChair(cf.createMagicChair());
        c.sit();
        c.setChair(cf.createFunctionalChair());
        c.sit();
    }
}
