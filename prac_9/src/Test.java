public class Test {
    public static void main(String[] args) {
        Nameable[] N = new Nameable[3];
        N[0] = new Animal("Max", "Dog");
        N[1] = new Car("Volkswagen", 60);
        N[2] = new Planet("Pluto", 1000);

        for (Nameable n : N) {
            System.out.println(n.getName());
        }
    }
}