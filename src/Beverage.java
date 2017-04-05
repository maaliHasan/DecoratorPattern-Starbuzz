/**
 * Created by mhasan on 4/5/2017.
 */
public abstract class Beverage  {
    String description ="unknown beverage !";
    String size;

    public abstract double cost();

    public void setDescription(String description){

        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    public String getSize(){
        return size;
    }
    public  void setSize(String size){
       this.size=size;
    }
}
