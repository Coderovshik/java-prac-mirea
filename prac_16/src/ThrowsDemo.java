import java.util.Scanner;
import java.lang.Exception;

public class ThrowsDemo {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        boolean isCorrect = false;
        while (!isCorrect) {
            // try {
                printDetails(key);
                isCorrect = true;
            // } catch (Exception e) {
            //     System.out.println("Incorrect input: try again");
            // }
        }
    }

    public void printDetails(String key) throws Exception {
        // try {
            String message = getDetails(key);
            System.out.println(message);
        // } catch (Exception e) {
        //     throw e;
        // }
    }

    private String getDetails(String key) throws Exception {
        if (key == "q") {
            throw new Exception("Key set to empty string");
        }

        return "data for " + key;
    }
}