package semenar_2;

public class main {

    public static void main(String[] args) {

        Market queue = new Market();

        queue.takeInQueue(new Human("Ruslan", true, true));
        queue.takeInQueue(new Human("Ludmila", false));
        queue.takeInQueue(new Human("Oleg"));
        queue.update();
    }
}
