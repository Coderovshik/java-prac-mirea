/**
 * Order
 */
public interface Order {
    public void place(Item item);
    
    public boolean remove(Item item);

    public int removeAll(Item item);

    public Item[] toArray();

    public double getTotal();

    public int getNumberOf(Item item);

    public String[] getNames();

    public Item[] getSorted();
}
