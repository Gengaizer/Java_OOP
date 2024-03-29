package Home;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);

        this.temperature = temperature;

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Напиток %s, объемом %d, температура %d", this.getName(), this.getVolume(),
                this.getTemperature());
    }
}
