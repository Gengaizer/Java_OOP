package semenar_6.Tusk2;

/*
 * В этом примере, чтобы добавить поддержку других фигур, придется изменять класс AreaCalculator.
 * Это нарушает OCP, так как класс не открыт для расширения и закрыт для изменения.
 */

interface AreaCalculator {
    public double calculateArea();
}

class Rectangle implements AreaCalculator {
    public double width;
    public double height;

    @Override
    public double calculateArea() {
        return width * height;
    }

}
