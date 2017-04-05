/**
 * Created by mhasan on 4/5/2017.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage ;
    public  Soy(  Beverage beverage ){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        return .50+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription()+"  , Soy";
    }
}
