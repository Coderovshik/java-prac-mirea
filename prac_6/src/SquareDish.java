public class SquareDish extends Dish {
    private double side;

    public SquareDish(String material, int timeToWash, double side) {
        super("square", material, timeToWash);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
