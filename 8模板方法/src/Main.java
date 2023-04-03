import CaffineBeverage.impl.Caffee;
import CaffineBeverage.impl.Tea;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Tea tea = new Tea();
        tea.prepareRecipe();

        Caffee caffee = new Caffee();
        caffee.prepareRecipe();

    }
}