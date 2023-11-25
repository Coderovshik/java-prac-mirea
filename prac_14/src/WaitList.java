package src;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * WaitList
 */
public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    
    public WaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<E>(c);
    }

    @Override
    public String toString() {
        return content.toString();
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean contains(Collection<E> c) {
        return content.contains(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}