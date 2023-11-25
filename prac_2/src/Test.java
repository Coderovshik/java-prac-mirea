import java.lang.reflect.Array;
import java.util.*;

/**
 * Test
 */
public class Test {   
    public static void main(String[] args) {
        Exercise ex = new Exercise();

        int[] arr = {1, 2, 3, 4, 5};
        ex.printSum(arr);
        System.out.println("-----------------------------");
        
        ex.printArgs(args);
        System.out.println("-----------------------------");

        ex.printHarmonicSeries();
        System.out.println("-----------------------------");

        ex.generateAndSort(10, 50);
        System.out.println("-----------------------------");

        System.out.println(ex.factorial(5));
    }
}