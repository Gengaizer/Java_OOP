package semenar_6.Tusk4;

/*
 
Здесь класс Switch жестко зависит от класса LightBulb,
нарушая DIP. Чтобы следовать DIP, зависимость должна быть инвертирована с использованием интерфейсов или абстракций.

Эти примеры демонстрируют нарушение каждого из принципов SOLID на языке Java.
Чтобы улучшить код, следует рассмотреть возможности его рефакторинга, чтобы соответствовать этим принципам.
 */

class LightBulb implements Switchabl {
    public void turnOn() {
        // Включение лампочки
    }

    public void turnOff() {
        // Выключение лампочки
    }
}

interface Switchabl {
    public void turnOn();

    public void turnOff();
}

class Switch {
    private Switchabl bulb;

    public Switch(Switchabl device) {
        this.bulb = device;
    }

    public void operate() {
        // Работа с выключателем
        bulb.turnOn();
    }
}