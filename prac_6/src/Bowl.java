public class Bowl extends Dish {
    private double depth;

    public Bowl(String material, int timeToWash, double depth) {
        super("bowl", material, timeToWash);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void printDish() {
        System.out.println("hello");
    }
}
