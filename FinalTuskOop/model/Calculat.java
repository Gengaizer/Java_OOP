package FinalTuskOop.model;

public class Calculat implements Variable {
    Double varReal, varRealOther, varImaginary, varImaginaryOther;

    @Override
    public String result() {
        return null;
    }

    @Override
    public Double setVarRealOne(double vro) {
        this.varReal = vro;
        return varReal;
    }

    @Override
    public Double setVarRealTwo(double vrt) {
        this.varRealOther = vrt;
        return varRealOther;
    }

    @Override
    public Double setVarImaginaryOne(double vio) {
        this.varImaginary = vio;
        return varImaginary;
    }

    @Override
    public Double setVarImaginaryTwo(double vit) {
        this.varImaginaryOther = vit;
        return varImaginaryOther;
    }

}
