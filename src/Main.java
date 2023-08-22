
public class Main {
    public static void main(String[] args) {
        People pl = new People();
        pl.newName();
        People pl2 = new People();
        pl2.newName();
        Markket markket = new Markket();
        markket.NewPeopleMarket(pl);
        markket.NewQueue(pl);
        markket.InProduct();
        markket.NewPeopleMarket(pl2);
        markket.NewQueue(pl2);
        markket.GetProduct();
        markket.DelQueue();
        markket.DelQueue();
        markket.DelPeopkeMarket(pl);
        markket.DelPeopkeMarket(pl2);
    }
}