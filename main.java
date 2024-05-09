public class main {
    public static void main(String[] args) {
        HotBeverage tea = new HotBeverage("Tea", 200);
        HotDrink coffee = new HotDrink("Coffee", 250, 80);

        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();

        HotBeverage teaFromMachine = vendingMachine.getProduct("Tea", 200);
        HotDrink coffeeFromMachine = vendingMachine.getProduct("Coffee", 250, 80);

        tea.prepare();
        coffee.prepare();
        teaFromMachine.prepare();
        coffeeFromMachine.prepare();
    }
}