package exercise3;

public class TestBook {
    public static void main(String[] args) {
        Book b = new Book();
        b.setAuthor("Ray Bradbury");
        b.setTitle("Fahrenheit 451");
        b.setWasWritten(1953);
        b.setWasPublished(1953);

        System.out.println(b.getAuthor());
        System.out.println(b.getTitle());
        System.out.println(b.getWasWritten());
        System.out.println(b.getWasPublished());
    }
}
