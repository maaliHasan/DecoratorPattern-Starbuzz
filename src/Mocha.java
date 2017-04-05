/**
 * Created by mhasan on 4/5/2017.
 */
public class Mocha extends  CondimentDecorator {
    Beverage beverage;

    public  Mocha(Beverage beverage){
         this.beverage=beverage;
    }
    @Override
    public double cost() {
        double cost= beverage.cost();
        if(this.getSize()=="tall"){
        return  cost +.10;
        }
        else if(this.getSize()=="grande"){
        return cost +.15;
        }
        else if(this.getSize()=="venti"){
            return cost +.20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Mocha ";
    }
    public String getSize(){
        return beverage.getSize();
    }
}
