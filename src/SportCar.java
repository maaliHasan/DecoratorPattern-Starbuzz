/**
 * Created by mhasan on 4/6/2017.
 */
public class SportCar extends CarDecorator {
    public SportCar(Car car) {
        super(car);

    }
    public void assemble(){
        super.assemble();
        System.out.print("Adding Feature of Sport Car ! ");
    }
}
