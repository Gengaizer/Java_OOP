package semenar_1;

class Animal {
    String type;

    // Конструктор суперкласса
    public Animal(String type) {
        this.type = type;
        System.out.println("Создано животное типа: " + type);
    }
}

class Dog extends Animal {
    String breed;

    // Конструктор подкласса
    public Dog(String type, String breed) {
        super(type); // Вызов конструктора суперкласса
        this.breed = breed;
        System.out.println("Создана собака породы: " + breed);
    }
}

public class PrimerCherezKonstructor {
    public static void main(String[] args) {
        Dog myDog = new Dog("Собака", "Лабрадор");
    }
}