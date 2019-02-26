package T_20180112_proglang_su.Java18;

// Простой конструктор.
class MyClass01 {
    int x;

    // Ниже конструктор
    MyClass01(int i) {
        x = i;
    }
}
public class Test18_06_01 {
    public static void main(String args[]) {
        MyClass01 t1 = new MyClass01( 10 );
        MyClass01 t2 = new MyClass01( 20 );
        System.out.println(t1.x + " " + t2.x);
    }
}