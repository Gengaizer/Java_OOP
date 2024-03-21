package FinalTuskOop.model;

public class Multiplication extends Calculat {
    @Override
    public String result() {
        double newReal = varReal * varRealOther - varImaginary * varImaginaryOther;

        double newImaginary = varReal * varImaginaryOther + varImaginary * varRealOther;

        return String.format("%.1f + %.1fi", newReal, newImaginary);
    }
}
