/**
 * Created by mhasan on 4/5/2017.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1.2+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }
}
