public class RoundDish extends Dish {
    private double radius;

    public RoundDish(String material, int timeToWash, double radius) {
        super("circle", material, timeToWash);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
