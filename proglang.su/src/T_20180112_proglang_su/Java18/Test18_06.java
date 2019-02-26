package T_20180112_proglang_su.Java18;

    //Конструктор
class MyClass {
    int x;
    int y;

    // Далее следует конструктор
    MyClass() {
        x = 10;
        y = 20;
    }
}

public class Test18_06 {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        System.out.println(t1.x + " " + t2.y);
    }
}