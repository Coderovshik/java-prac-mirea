import java.util.Scanner;
/**
 * Recursion
 */
public class Recursion {
    public static void solution13() {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num == 0) return;

        System.out.println(num);

        num = scanner.nextInt();
        if (num == 0) return;

        solution13();
    }

    public static void solution14(int N) {
        if (N == 0) return;
        solution14(N / 10);
        System.out.println(N % 10);
    }

    public static void solution15(int N) {
        if (N == 0) return;
        System.out.println(N % 10);
        solution15(N / 10);
    }

    public static void solution16(int count, int max) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println(count);
            return;
        }

        if (num == max) {
            solution16(count + 1, max);
        } else if (num > max) {
            solution16(1, num);
        } else {
            solution16(count, max);
        }
    }

    public static int solution17() {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num == 0) return 0;

        return Math.max(num, solution17());
    }
    
    public static void main(String[] args) {
        System.out.println(solution17());
    }
}