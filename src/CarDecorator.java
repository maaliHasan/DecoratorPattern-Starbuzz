/**
 * Created by mhasan on 4/6/2017.
 */
public  class CarDecorator implements Car {
    Car car ;
    public CarDecorator(Car car){
        this.car= car;
    }
    @Override
    public  void assemble(){
        this.car.assemble();

    }


}
