package exercise2;

public class Human {
    private Head head;
    private Hand[] hands;
    private Leg[] legs;

    public Human() {
        head = new Head();
        hands = new Hand[] {new Hand(), new Hand()};
        legs = new Leg[] {new Leg(), new Leg()};
    }

    public Head getHead() {
        return head;
    }

    public Hand[] getHands() {
        return hands;
    }

    public Leg[] getLegs() {
        return legs;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setHands(Hand[] hands) {
        this.hands = hands;
    }

    public void setLegs(Leg[] legs) {
        this.legs = legs;
    }
}
