public class ArrayQueueModule<T> implements ArrayQueueADT<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    
    public ArrayQueueModule(int capacity) {
        queue = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    //- Предусловие: очередь должна быть инициализирована.
    //- Постусловие: элемент item добавлен в конец очереди.
    public void enqueue(T item) {
        if (isFull()) {
            throw new IllegalStateException("Очередь переполнена");
        }
        
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }
    
    //- Предусловие: очередь не должна быть пустой.
    //- Постусловие: элемент удален из начала очереди и возвращен.
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        
        T item = (T) queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return item;
    }
    
    //- Предусловие: очередь не должна быть пустой.
    //- Постусловие: элемент из начала очереди возвращен без удаления.
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        
        return (T) queue[front];
    }
    
    //- Предусловие: очередь должна быть инициализирована.
    //- Постусловие: возвращено количество элементов в очереди.
    public int size() {
        return size;
    }
    
    //- Предусловие: очередь должна быть инициализирована.
    //- Постусловие: возвращено true, если очередь пуста, и false в противном случае.
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void clear() {
        for (int i = 0; i < queue.length; i++) {
            queue[i] = null;
        }
        front = 0;
        rear = -1;
        size = 0;
    }
    
    private boolean isFull() {
        return size == queue.length;
    }
}
