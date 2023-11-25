package ex2;

public class ChairFactory implements AbstractChairFactory {
    public Chair createVictorianChair() {
        return new VictorianChair(0);
    }
    
    public Chair createMagicChair() {
        return new MagicChair();
    }

    public Chair createFunctionalChair() {
        return new FunctionalChair();
    }
}
