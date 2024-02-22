package Home;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("Latte", 400, 70));
        hotDrinks.add(new HotDrink("Kapuchino", 400, 70));
        hotDrinks.add(new HotDrink("Glasse", 300, 60));

        VendingMachineHotDrink vendingMachineHotDrink = new VendingMachineHotDrink();
        vendingMachineHotDrink.initHotDrink(hotDrinks);
        System.out.println((vendingMachineHotDrink.getProduct("Latte", 400, 70)));
    }

}
