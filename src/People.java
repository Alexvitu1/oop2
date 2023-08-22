public class People extends Buyer{

    @Override
    public Boolean SetBehavior() {
        return SetBehaviorClass;
    }

    @Override
    public Boolean DelBehavior() {
        return DelBehaviorClass;
    }

    @Override
    String newName() {
        System.out.println("Напишите имя человека, который пришел в магазин ");
        String newName = sc.next();
        return name = newName;
    }

    @Override
    String getName() {
        return name;
    }
}