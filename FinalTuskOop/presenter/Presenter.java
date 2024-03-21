package FinalTuskOop.presenter;

import FinalTuskOop.model.Calculat;
import FinalTuskOop.model.FileLogger;
import FinalTuskOop.model.MetodFactory;
import FinalTuskOop.viev.Viev;

public class Presenter {
    private Viev viev;
    private Calculat calc;
    private MetodFactory metodFactory = new MetodFactory();
    private FileLogger<String> fl = new FileLogger<String>();

    public Presenter(Viev varReal, Calculat varImaginary) {
        viev = varReal;
        calc = varImaginary;
    }

    public void calculator() {
        double varRealFirst = viev.getVar("varRealFirst: ");

        double varRealTwo = viev.getVar("varRealTwo: ");
        double varImaginaryFirst = viev.getVar("varImaginaryFirst: ");
        double varImaginaryTwo = viev.getVar("varImaginaryTwo: ");
        Character action = viev.getAction("Введите желаемую операцию: ");
        calc = metodFactory.MetodCalculat(action);
        calc.setVarRealOne(varRealFirst);
        calc.setVarRealTwo(varRealTwo);
        calc.setVarImaginaryOne(varImaginaryFirst);
        calc.setVarImaginaryTwo(varImaginaryTwo);
        String res = calc.result();
        // viev.print(res, "result");
        fl.log(res);

    }

}
