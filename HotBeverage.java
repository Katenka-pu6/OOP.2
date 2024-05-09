class HotBeverage {
    protected String name;
    protected int volume;

    public HotBeverage(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }
}

class HotDrink extends HotBeverage {
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " at " + temperature + "°C");
    }
}