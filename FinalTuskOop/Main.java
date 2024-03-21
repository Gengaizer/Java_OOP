package FinalTuskOop;

import FinalTuskOop.model.Calculat;
import FinalTuskOop.presenter.Presenter;
import FinalTuskOop.viev.Viev;

public class Main {
    public static void main(String[] args) {
        Presenter summ = new Presenter(new Viev(), new Calculat());
        summ.calculator();
    }
}