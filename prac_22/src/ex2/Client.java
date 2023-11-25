package ex2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Client took a sit.");
        chair.onSit();
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
