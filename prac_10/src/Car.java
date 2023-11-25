public class Car implements Nameable {
    int[] position;
    int speed;
    String name;

    public Car(String name, int speed) {
        this.position = new int[] {0, 0};
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void moveX() {
        this.position[0] += this.speed;
    }

    public void moveY() {
        this.position[1] += this.speed;
    }

    public int[] getPosition() {
        return position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
