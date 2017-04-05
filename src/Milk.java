/**
 * Created by mhasan on 4/5/2017.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage ;

    public Milk(Beverage beverage){
        this.beverage=beverage;

    }
    public String getDescription(){

        return  beverage.getDescription()+", Milk";
    }
    public double cost(){
        return  0.1 +beverage.cost();
    }
}
