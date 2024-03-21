package FinalTuskOop.model;

public class Division extends Calculat {

    @Override
    public String result() {
        double denominator = varRealOther * varRealOther + varImaginaryOther * varImaginaryOther;

        double newReal = (varReal * varRealOther + varImaginary * varImaginaryOther) / denominator;

        double newImaginary = (varImaginary * varRealOther - varReal * varImaginaryOther) / denominator;

        if (newImaginary >= 0) {
            return String.format("%.1f + %.1f i", newReal, newImaginary);

        }

        return String.format("%.1f -  %.1f i", newReal, newImaginary);
    }
}
