package src;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     * Adds an element if capacity is not exceeded
     * 
     * @param element
     *          element to add
     */
    @Override
    public void add(E element) {
        if (content.size() == capacity) {
            System.out.println("Cannot add new element. Capacity exceeded.");
            return;
        }

        content.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList(max: " + capacity + ") " + super.toString();
    }
}
