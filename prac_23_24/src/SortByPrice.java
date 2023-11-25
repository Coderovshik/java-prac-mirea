import java.util.Comparator;

public class SortByPrice implements Comparator<Item> {
    public int compare(Item a, Item b) {
        return (int)Math.signum(a.getPrice() - b.getPrice());
    }
}
