/**
 * Created by mhasan on 4/6/2017.
 */
public class CarTest {
    public static void main(String args[]){
        Car car= new BasicClass();
        CarDecorator carDecorator= new luxuryCar(car);
        CarDecorator carDecorator1= new SportCar(carDecorator);
        carDecorator1.assemble();

    }
}
