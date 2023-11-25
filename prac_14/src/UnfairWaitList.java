package src;

import java.util.ArrayList;

public class UnfairWaitList<E> extends WaitList<E> {
    private ArrayList<E> deleted;

    public UnfairWaitList() {
        super();
        deleted = new ArrayList<>();
    }

    /**
     * removes an element (cant be used for list head)
     * 
     * @param element
     */
    public void remove(E element) {
        if (element == content.peek()) {
            System.out.println("Cannot remove head of the list.");
            return;
        }

        content.remove(element);
        deleted.add(element);
    }

    public void add(E element) {
        if (deleted.contains(element)) {
            System.out.println("Cannot add element, which was once deleted");
            return;
        }

        content.add(element);
    }

    /**
     * moves an element to back of list
     * 
     * @param element
     */
    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }
}
