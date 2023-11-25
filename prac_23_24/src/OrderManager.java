import java.util.HashMap;

public class OrderManager {
    private Order[] orders;
    private HashMap<String, Order> pairs;

    public OrderManager(int numberOfTables) {
        orders = new Order[numberOfTables];
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException {
        if (tableNumber >= orders.length) {
            throw new IllegalTableNumber("table " + tableNumber + " does not exist");
        }
        if (orders[tableNumber] != null) {
            throw new OrderAlreadyAddedException("Cant place order on table " + tableNumber);
        }
        orders[tableNumber] = order;
    }

    public void add(Order order, String adress) throws OrderAlreadyAddedException {
        if (pairs.get(adress) != null) {
            throw new OrderAlreadyAddedException("Cant place order on table " + adress);
        }
        pairs.put(adress, order);
    }

    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }

    public Order getOrder(String adress) {
        return pairs.get(adress);
    }

    public void addDish(Dish dish, int tableNumber) {
        orders[tableNumber].place(dish);
    }

    public void addDish(Item item, String adress) {
        pairs.get(adress).place(item);
    }

    public void removeOrder(int tableNumber) {
        orders[tableNumber] = null;
    }

    public void removeOrder(String adress) {
        pairs.remove(adress);
    }

    public int freeTableNumber() {
        int count = 0;
        
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                count++;
            }
        }

        return count;
    }

    public int[] freeTableNumbers() {
        int[] numbers = new int[freeTableNumber()];
        
        int j = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                numbers[j] = i;
                j++;
            }
        }

        return numbers;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double summary = 0;

        for (Order order : orders) {
            if (order != null) {
                summary += order.getTotal();
            }
        }

        return summary;
    }

    public double mapOrdersCostSummary() {
        double summary = 0;

        for (Order order : pairs.values()) {
            if (order != null) {
                summary += order.getTotal();
            }
        }

        return summary;
    }

    public int dishQuantity(String dishName) {
        int count = 0;

        for (Order order : orders) {
            if (order != null) {
                count += order.getNumberOf(new Dish(dishName, null));
            }
        }

        return count;
    }

    public int mapDishQuantity(String dishName) {
        int count = 0;

        for (Order order : pairs.values()) {
            count += order.getNumberOf(new Dish(dishName, null));
        }

        return count;
    }
}
