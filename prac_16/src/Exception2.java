import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
            //throw new InputMismatchException();
        } catch (NumberFormatException e) {
            System.err.println("Wrong input");
        } catch (ArithmeticException e) {
            System.err.println("Division by zero");
        } finally {
            System.out.println("Finally");
        }
    }
}
