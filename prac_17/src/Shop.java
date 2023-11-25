import java.util.HashMap;

public class Shop {
    public HashMap<String, Integer> clients;

    public Shop() {
        clients = new HashMap<>();
        clients.put("UPA", 123456);
        clients.put("DMA", 45678);
        clients.put("KRS", 190456);
        clients.put("VAL", 945323);
    }

    public void makeOrder(String initials, int id) {
        if (!clients.containsKey(initials) || clients.get(initials) != id) {
            throw new InvalidIdException("Invalid id", null);
        }
        System.out.println("Order was successfully made");
    }
}
