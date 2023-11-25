import java.util.Scanner;

public class UserExceptionDemo {

    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop.clients);
        Scanner s = new Scanner(System.in);
        String initials = s.next();
        int id = Integer.parseInt(s.next());
        try {
            shop.makeOrder(initials, id);
        } catch (InvalidIdException e) {
            System.err.println(e);
        }
    }
}