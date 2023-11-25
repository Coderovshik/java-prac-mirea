import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class InternetOrder implements Order {
    private CircularList<Item> order;

    public InternetOrder() {
        order = new CircularList<>(new ItemComparator());
    }

    public InternetOrder(Item[] newItems) {
        order = new CircularList<>(new ItemComparator());

        for (Item item : newItems) {
            order.addNode(item);
        }
    }

    public void place(Item item) {
        order.addNode(item);
    }
    
    public boolean remove(Item item) {
        return order.deleteNode(item);
    }

    public int removeAll(Item item) {
        boolean isPresent = order.deleteNode(item);
        int deleteCount = 0;

        while (isPresent) {
            deleteCount++;
            isPresent = order.deleteNode(item);
        }

        return deleteCount;
    }

    public Item[] toArray() {
        Object[] temp = order.toArray();
        Item[] items = new Item[temp.length];
        for (int i = 0; i < temp.length; i++) {
            items[i] = (Item)temp[i];
        }

        return items;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : toArray()) {
            total += item.getPrice();
        }

        return total;
    }

    public int getNumberOf(Item item) {
        Item[] items = toArray();

        int count = 0;
        for (Item i : items) {
            if (new ItemComparator().compare(i, item) == 0) {
                count++;
            }
        }

        return count;
    }

    public String[] getNames() {
        HashMap<String, Item> uniqeNames = new HashMap<>();

        for (Item item : toArray()) {
            uniqeNames.put(item.getName(), item);
        }

        String[] names = new String[uniqeNames.size()];
        uniqeNames.keySet().toArray(names);

        return names;
    }

    public Item[] getSorted() {
        Item[] items = toArray();

        Arrays.sort(items, new SortByPrice());
        Arrays.sort(items, Collections.reverseOrder());

        return items;
    }
}
