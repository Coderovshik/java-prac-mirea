public class ArrayQueue<T> {
    private ArrayQueueModule<T> queue;

    public ArrayQueue(ArrayQueueModule<T> q) {
        queue = q;
    }

    public void enqueue(T item) {
        queue.enqueue(item);
    }
    
    //- Предусловие: очередь не должна быть пустой.
    //- Постусловие: элемент удален из начала очереди и возвращен.
    public T dequeue() {
        return queue.dequeue();
    }
    
    //- Предусловие: очередь не должна быть пустой.
    //- Постусловие: элемент из начала очереди возвращен без удаления.
    public T element() {
        return queue.element();
    }
    
    //- Предусловие: очередь должна быть инициализирована.
    //- Постусловие: возвращено количество элементов в очереди.
    public int size() {
        return queue.size();
    }
    
    //- Предусловие: очередь должна быть инициализирована.
    //- Постусловие: возвращено true, если очередь пуста, и false в противном случае.
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public void clear() {
        queue.clear();
    }
}
