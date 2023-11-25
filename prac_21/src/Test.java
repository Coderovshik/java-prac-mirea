public class Test {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> cq = new ArrayQueueModule<>(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        System.out.println(cq.isEmpty());
        System.out.println(cq.size());

        System.out.println(cq.dequeue());
        System.out.println(cq.isEmpty());
        System.out.println(cq.size());
    }
}
