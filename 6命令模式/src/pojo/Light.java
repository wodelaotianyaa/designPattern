package pojo;

public class Light {
    public String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Light:"+name+" on!");
    }
    public void off(){
        System.out.println("Light:"+name+" off!");
    }

}
