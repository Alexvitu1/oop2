import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Markket implements QueueBehavior, MarketBehaviour{
    List<Buyer> peoples = new LinkedList<>();
    Queue<Buyer> queue = new ArrayDeque<>();

    @Override
    public void NewPeopleMarket(Buyer people) {
        System.out.println("Покупатель с именем " + people.getName() + " зашел в магазин");
        peoples.add(people);
    }

    @Override
    public void DelPeopkeMarket(Buyer people) {
        System.out.println("Покупатель с именем " + people.getName() + " ушел из магазина");
        peoples.remove(people);

    }

    @Override
    public void update() {

    }

    @Override
    public void NewQueue(Buyer people) {
        System.out.println(people.getName() + " занял очередь");
        queue.add(people);

    }

    @Override
    public void DelQueue() {
        System.out.println(queue.peek().getName() + " ушел из магазина");
        queue.poll();
    }

    @Override
    public void InProduct() {
        queue.peek().SetBehavior();
        System.out.println(queue.peek().getName() + " заказал");

    }

    @Override
    public void GetProduct() {
        queue.peek().DelBehavior();
        System.out.println(queue.peek().getName() + " забрал заказ");

    }
}