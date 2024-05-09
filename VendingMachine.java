interface VendingMachine {
    HotBeverage getProduct(String name, int volume);
    HotDrink getProduct(String name, int volume, int temperature);
}

class HotBeverageVendingMachine implements VendingMachine {

    @Override
    public HotBeverage getProduct(String name, int volume) {
        return new HotBeverage(name, volume);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrink(name, volume, temperature);
    }
}