import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        InternetOrder ord1 = new InternetOrder();
        ord1.place(new Dish(100.0, "name1", "desc1"));
        ord1.place(new Drink(200.0, "name2", "desc2"));
        ord1.place(new Dish(300.0, "name3", "desc3"));
        ord1.place(new Dish(100.0, "name1", "desc1"));
        ord1.place(new Drink(400.0, "name4", "desc4"));

        Item[] items = ord1.toArray();
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getDescription() + " " + item.getPrice());
        }
        System.out.println("----------------------------------------");

        ord1.remove(new Drink(200.0, "name2", "desc2"));
        ord1.removeAll(new Dish(100.0, "name1", "desc1"));

        items = ord1.toArray();
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getDescription() + " " + item.getPrice());
        }
        System.out.println("----------------------------------------");

        Item[] newOrder = new Item[] {
            new Dish(100.0, "name1", "desc1"),
            new Drink(200.0, "name2", "desc2"),
            new Dish(300.0, "name3", "desc3"),
            new Dish(100.0, "name1", "desc1"),
            new Drink(400.0, "name4", "desc4")
        };

        InternetOrder ord2 = new InternetOrder(newOrder);

        OrderManager ordMan = new OrderManager(10);
        try {
          ordMan.add(ord1, 0);

        } catch (OrderAlreadyAddedException e) {
            System.err.println(e);
        }

        try {
          ordMan.add(ord2, 1);

        } catch (OrderAlreadyAddedException e) {
            System.err.println(e);
        }

        System.out.println(Arrays.toString(ordMan.freeTableNumbers()));

        System.out.println(ordMan.ordersCostSummary());

        System.out.println(ordMan.dishQuantity("name1"));
    }
}
