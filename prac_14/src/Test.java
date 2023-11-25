package src;

/**
 * @author me
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        BoundedWaitList<String> bwl_s = new BoundedWaitList<>(5);
        UnfairWaitList<Integer> uwl_i = new UnfairWaitList<>();

        bwl_s.add("Amogus");
        bwl_s.add("Sus");
        bwl_s.add("Amogus");
        bwl_s.add("Sus");
        bwl_s.add("Amogus");
        bwl_s.add("Sus");
        
        System.out.println(bwl_s);

        uwl_i.add(1);
        uwl_i.add(2);
        uwl_i.add(3);
        uwl_i.remove(1);
        uwl_i.moveToBack(1);

        System.out.println(uwl_i);
    }
}
