package StarBuck;

public abstract class Beverage {

    public String description = "Unkown";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public String display(){
        return getDescription()+":"+cost();
    }

}
