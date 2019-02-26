package T_2018272050_itProger;

public class T_2018301844_02_Person {
    public int height = 180;
    String name = "Default";

    public void say(String name) {
        System.out.println("Hello, " + name);
    }

    public T_2018301844_02_Person() {}

    public T_2018301844_02_Person(int h, String n) {
        height = h;
        name = n;
    }

    public T_2018301844_02_Person(String n) {
        name = n;
    }
}