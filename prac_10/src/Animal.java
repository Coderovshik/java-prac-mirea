public class Animal implements Nameable {
    String species;
    String name;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return species;
    }
}
