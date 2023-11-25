public class ArrayOfAny<E> {
    private Object[] A;

    ArrayOfAny(int size) {
        A = new Object[size];
    }

    public void set(int i, E val) {
        if (i >= A.length) {
            return;
        }

        A[i] = (Object)val;
    }

    public E get(int i) {
        return (E)A[i];
    }
}
