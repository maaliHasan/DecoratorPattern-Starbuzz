/**
 * Created by mhasan on 4/6/2017.
 */
public class luxuryCar extends CarDecorator {

    public luxuryCar( Car car ) {

        super(car);


    }
    public void assemble(){
        super.assemble();
       System.out.print("Adding Feature of luxury Car !");
    }
}
