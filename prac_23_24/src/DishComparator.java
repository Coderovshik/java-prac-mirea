import java.util.Comparator;

public class DishComparator implements Comparator<Dish> {
    public int compare(Dish a, Dish b) {
        return a.getName().compareTo(b.getName());
    }
}
