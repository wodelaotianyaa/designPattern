import Iterator.Iterator;
import pojo.Menu.ShopOneMenu;
import pojo.Menu.ShopTwoMenu;
import pojo.MenuItem;

public class ShopTotalSimulator {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ShopOneMenu shopOneMenu = new ShopOneMenu();
        ShopTwoMenu shopTwoMenu = new ShopTwoMenu();

        Iterator i1 = shopOneMenu.createIterator();
        Iterator i2 = shopTwoMenu.createIterator();

        review(i1);
        review(i2);
    }
    public static void review(Iterator i){
        while(i.hasNext()){
            MenuItem item = (MenuItem) i.next();
            System.out.println(item.toString());
        }
    }
}