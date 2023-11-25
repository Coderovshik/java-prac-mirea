public class TestDish {
    public static void main(String[] args) {
        DishShop shop = new DishShop();

        shop.buyNextDish();
        
        RoundDish rd = new RoundDish("granite", 15000, 5);
        SquareDish sd = new SquareDish("metal", 30000, 6);
        Bowl b = new Bowl("porcelain", 60000, 7);

        shop.contributeDish(rd);
        shop.contributeDish(sd);
        shop.contributeDish(b);

        shop.printProductList();

        shop.buyNextDish();
    }
}
