/**
 * Created by mhasan on 4/5/2017.
 */
public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", the  cost is" + beverage.cost() + "$");

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + ", the  cost is" + beverage1.cost() + "$");


    }
}
