import pojo.MenuComponent;
import pojo.Waitress;
import pojo.impl.Menu;
import pojo.impl.MenuItem;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MenuComponent m1 = new Menu("m1","breakfast");
        MenuComponent m2 = new Menu("m2","lunch");
        MenuComponent m3 = new Menu("m3","dinner");
        MenuComponent m4 = new Menu("m4","coffee");

        MenuComponent allmenus = new Menu("mmm","all menus");
        allmenus.add(m1);
        allmenus.add(m2);
        allmenus.add(m3);
        allmenus.add(m4);

        m3.add(new MenuItem("pasta","god",true,0.1));
        m3.add(new MenuItem("padfsasta","god",true,0.561));

        Waitress waitress = new Waitress(allmenus);
        waitress.printMenu();
    }
}