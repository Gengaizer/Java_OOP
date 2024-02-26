package semenar_2;

public class Human extends Actor {
    public Human(String name, boolean isTakeOrder, boolean isMakeOrder) {
        this.name = name;
        this.isTakeOrder = isTakeOrder;
        this.isMakeOrder = isMakeOrder;
    }

    public Human(String name, boolean isMakeOrder) {
        this(name, isMakeOrder, true);
    }

    public Human(String name) {
        this(name, true, true);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String setName(String name) {

        return this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }
}