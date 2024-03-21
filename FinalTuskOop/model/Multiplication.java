package FinalTuskOop.model;

public class Multiplication extends Calculat {
    @Override
    public String result() {
        double newReal = varReal * varRealOther - varImaginary * varImaginaryOther;

        double newImaginary = varReal * varImaginaryOther + varImaginary * varRealOther;

        if (newImaginary >= 0) {
            return String.format("%.1f + %.1f i", newReal, newImaginary);

        }

        return String.format("%.1f -  %.1f i", newReal, newImaginary);
    }
}
