package FinalTuskOop.model;

public class Summ extends Calculat {

    @Override
    public String result() {
        double newReal = varReal + varRealOther;
        double newImaginary = varImaginary + varImaginaryOther;
        if (newImaginary > 0) {
            return String.format("%.1f + %.1f i", newReal, newImaginary);

        }

        return String.format("%.1f -  %.1f i", newReal, -newImaginary);
    }

}
