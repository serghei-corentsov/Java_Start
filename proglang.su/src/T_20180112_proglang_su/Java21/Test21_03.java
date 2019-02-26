package T_20180112_proglang_su.Java21;

public class Test21_03 {
    // Метод экземпляра внешнего класса
    void my_Method() {
        int num = 888;

        // Локальный метод внутреннего класса
        class MethodInner_Demo {
            public void print() {
                System.out.println("Это метод внутреннего класса: " + num);
            }
        } // Конец внутреннего класса

        // Доступ к внутреннему классу
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }

    public static void main(String args[]) {
        Test21_03 outer = new Test21_03();
        outer.my_Method();
    }
}