package T_20180112_proglang_su.Java21;

class Outer_Demo {
    // Частная переменная внешнего класса
    private int num = 2018;

    // Внутренний класс
    public class Inner_Demo {
        public int getNum() {
            System.out.println("Это метод getnum внутреннего класса");
            return num;
        }
    }
}

public class Test21_02 {
    public static void main(String args[]) {
        // Создание внешнего класса
        Outer_Demo outer = new Outer_Demo();

        // Создание внутреннего класса
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}