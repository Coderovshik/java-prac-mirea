import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {
    public int compare(Item a, Item b) {
        return a.getName().compareTo(b.getName());
    }
}
