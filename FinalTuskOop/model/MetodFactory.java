package FinalTuskOop.model;

public class MetodFactory {
    public Calculat MetodCalculat(Character action) {
        if (action.equals('+')) {
            return new Summ();
        } else if (action.equals('/')) {
            return new Division();

        } else if (action.equals('*')) {
            return new Multiplication();
        }
        return new Calculat();
    }
}
