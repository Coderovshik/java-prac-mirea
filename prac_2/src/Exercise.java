import java.util.Arrays;
import java.util.Random;

public class Exercise {
    public void printSum(int[] A) {
        int n = A.length;
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        System.out.println(sum);

        sum = 0;
        int i = 0;
        while (i < n) {
            sum += A[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum += A[i];
            i++;
        } while (i < n);
        System.out.println(sum);
    }

    public void printArgs(String[] args) {
        int n = args.length;

        for (int i = 0; i < n; i++) {
            System.out.print(args[i] + ' ');
        }
        System.out.print('\n');
    }

    public void printHarmonicSeries() {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print((1. / i) + " ");
        }
        System.out.print('\n');
    }

    public void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.print('\n');
    }

    public void generateAndSort(int n, int m) {
        final Random r = new Random();
        
        int[] randArr = new int[n];
        for (int i = 0; i < n; i++) {
            randArr[i] = r.nextInt(m);
        }
        System.out.print("original array: ");
        printArray(randArr);
        
        Arrays.sort(randArr);
        System.out.print("sorted array: ");
        printArray(randArr);
    }

    public int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }

        return f;
    }
}
