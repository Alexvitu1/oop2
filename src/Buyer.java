import java.util.Scanner;

public abstract class Buyer implements BuyerBehavior{
    public String name;
    abstract String newName();
    abstract String getName();
    public Scanner sc = new Scanner(System.in);
    public Boolean SetBehaviorClass;
    public Boolean DelBehaviorClass;
}
