package CaffineBeverage;

public abstract class CaffineBaverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        portInCup();
        addCondiments();
    }
    void boilWater(){
        System.out.println("Boiling");
    }
    void portInCup(){
        System.out.println("Pouring into cup");
    }
    public abstract void brew();

    protected abstract void addCondiments();
}
