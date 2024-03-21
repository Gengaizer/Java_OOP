package FinalTuskOop.model;

public class Division extends Calculat {

    @Override
    public String result() {
        double denominator = varRealOther * varRealOther + varImaginaryOther * varImaginaryOther;

        double newReal = (varReal * varRealOther + varImaginary * varImaginaryOther) / denominator;

        double newImaginary = (varImaginary * varRealOther - varReal * varImaginaryOther) / denominator;

        return String.format("%.1f + %.1fi", newReal, newImaginary);
    }
}
