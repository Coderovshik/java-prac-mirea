public final class Dish implements Item {
    private final double price;
    private final String name;
    private final String description;

    public Dish(String name, String description) {
        this.price = 0;

        if (name != null && name.length() == 0) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;

        if (description != null && description.length() == 0) {
            throw new IllegalArgumentException("Description can't be empty");
        }
        this.description = description;
    }
    
    public Dish(double price, String name, String description) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be less than 0");
        }
        this.price = price;

        if (name != null && name.length() == 0) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;

        if (description != null && description.length() == 0) {
            throw new IllegalArgumentException("Description can't be empty");
        }
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
