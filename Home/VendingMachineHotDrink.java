package Home;

import java.util.ArrayList;

class VendingMachineHotDrink {

    private ArrayList<HotDrink> HD;

    public void initHotDrink(ArrayList<HotDrink> HD) {
        this.HD = HD;
    }

    public HotDrink getProduct(String HotCoffe, int volume, int temperature) {
        for (HotDrink coffe : HD) {
            if (coffe.getName().equals(HotCoffe) && coffe.getVolume() == volume
                    && coffe.getTemperature() == temperature) {
                return coffe;
            }
        }
        return null;
    }

    public Drink getProduct(String HotCoffe, int volume) {
        for (Drink coffe : HD) {
            if (coffe.getName().equals(HotCoffe) && coffe.getVolume() == volume) {
                return coffe;
            }
        }
        return null;
    }

}
