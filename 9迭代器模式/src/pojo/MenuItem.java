package pojo;

public class MenuItem {
    public String name;
    public String desciption;
    public boolean vegetarian;
    public  double price;

    public MenuItem(String name, String desciption, boolean vegetarian, double price) {
        this.name = name;
        this.desciption = desciption;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", desciption='" + desciption + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
