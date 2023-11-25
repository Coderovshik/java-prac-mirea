import java.util.ArrayList;

public class DishShop {
    private ArrayList<Dish> dishStock;

    public DishShop() {
        dishStock = new ArrayList<>();
    }

    public void buyNextDish() {
        if (dishStock.isEmpty()) {
            System.out.println("Shop is out of dishes.");
            return;
        }

        Dish nextDish = dishStock.remove(0);
        System.out.println("You bought " + nextDish + ".");
    }

    public void contributeDish(Dish dish) {
        System.out.println("You contributed " + dish + " to the shop.");
        dishStock.add(dish);
    }

    public void printProductList() {
        for (int i = 0; i < dishStock.size(); i++) {
            System.out.println(dishStock.get(i));
        }
    }
}
