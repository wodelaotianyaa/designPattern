package PizzaStoreSimulator;

public class PizzaSImulator {
    public static void main(String[] args) {
        PizzaStore ny = new NYPizzaStore();
        PizzaStore chi = new ChicagoPizzaStore();

        ny.orderPizza("CHESS");
        chi.orderPizza("CHESS");
    }
}
