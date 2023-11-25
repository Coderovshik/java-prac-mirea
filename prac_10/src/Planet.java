public class Planet implements Nameable {
    int diameter;
    String name;

    public Planet(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return this.name;
    }

    public int getDiameter() {
        return diameter;
    }
}
