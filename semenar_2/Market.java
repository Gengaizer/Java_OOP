package semenar_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Actor> actors = new ArrayList<>();

    @Override
    public void takeInQueue(Actor actor) {
        actors.add(actor);

    }

    @Override
    public void takeOrders() {
        actors.get(0).isMakeOrder = false;
        System.out.printf("%s Ваш заказ принят \n", actors.get(0));
        giveOrders();

    }

    @Override
    public void giveOrders() {

        actors.get(0).isTakeOrder = false;
        System.out.printf("%s Заказ выдан \n", actors.get(0));
        releaseFromQueue();
    }

    @Override
    public void releaseFromQueue() {
        System.out.printf("%s Всего хорошго! \n", actors.get(0));
        actors.remove(0);
        update();
    }

    @Override
    public void acceptToMarket(Actor actor) {

        takeOrders();

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        System.out.printf("%s Заказа нет, приходите позже \n", actors.get(0));
        actors.remove(0);
        update();

    }

    @Override
    public void update() {
        if (!actors.isEmpty()) {
            if (actors.get(0).isMakeOrder == true && actors.get(0).isTakeOrder == true) {
                acceptToMarket(actors.get(0));
            } else {
                releaseFromMarket(actors);
            }

        } else {
            System.out.println("очередь пуста");
        }
    }

}