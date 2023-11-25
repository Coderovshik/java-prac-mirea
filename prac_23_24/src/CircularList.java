import java.util.Comparator;

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class CircularList<T> {
    private Node<T> head;
    private Node<T> tail;

    private Comparator<T> comp;

    public CircularList(Comparator<T> comp) {
        this.comp = comp;
    }

    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }

    public boolean deleteNode(T data) {
        if (head == null) {
            System.out.println("Список пуст, невозможно удалить элемент");
            return false;
        }
    
        Node<T> current = head;
        boolean found = false;
        do {
            if (comp.compare(current.data, data) == 0) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                    head.prev = tail;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                found = true;
                break;
            }
            current = current.next;
        } while (current != head);
    
        return found;
    }    

    public T getHead() {
        return head.data;
    }

    public T getTail() {
        return tail.data;
    }

    public int getLength() {
        int length = 0;
        Node<T> current = head;
        if (head != null) {
            do {
                length++;
                current = current.next;
            } while (current != head);
        }
        return length;
    }    

    public Object[] toArray() {
        Object[] array = new Object[getLength()];
        Node<T> current = head;
        if (head != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = current.data;
                current = current.next;
            }
        }
        return array;
    }
}
