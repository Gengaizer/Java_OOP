package semenar_6.Tusk3;
//В данном случае, нарушается LSP, так как наследующий класс Ostrich изменяет ожидаемое поведение метода fly() базового класса Bird.

import java.util.ArrayList;

class Bird {
    public void fly() {
        // Реализация полета птицы
    }
}

class Ostrich extends Bird {

}

// Здесь Engineer вынужден реализовывать метод eat(), хотя он ему не нужен. ISP
// нарушается,
// так как интерфейс Worker должен быть разделен на более мелкие интерфейсы,
// чтобы избежать "жирных" интерфейсов.

interface work {
    void work();
}

interface eat {
    void eat();
}

class Worker {
    public void work() {
        // Реализация работы инженера
    }

    public void eat() {
        // Реализация приема пищи
    }

}

class Engineer extends Worker {
    Int[] arr = new int[10];
}
