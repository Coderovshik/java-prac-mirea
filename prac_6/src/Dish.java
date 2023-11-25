/**
 * Dish
 */
public abstract class Dish {
    private String shape;
    private String material;
    private int timeToWash;

    public Dish(String shape, String material, int timeToWash) {
        this.shape = shape;
        this.material = material;
        this.timeToWash = timeToWash;
    }

    public String getShape() {
        return shape;
    }

    public String getMaterial() {
        return material;
    }

    public int getTimeToWash() {
        return timeToWash;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTimeToWash(int timeToWash) {
        this.timeToWash = timeToWash;
    }

    abstract public void printDish();

    @Override
    public String toString() {
        return this.getShape() + " dish made of " + this.getMaterial();
    }
}