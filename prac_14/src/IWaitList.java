package src;
import java.util.Collection;

public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean contains(Collection<E> c);
    boolean isEmpty();
}
