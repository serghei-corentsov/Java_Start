package T_20180112_proglang_su.Java18;

    //Передача параметров по значению
public class Test18_03 {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Перед тем как передать, значения аргументов a = " + a + " и b = " + b);

        // Вызов метода передачи
        swapFunction(a, b);
        System.out.println("\nСейчас, до и после передачи значения аргументов ");
        System.out.println("остались неизменными, a = " + a + " и b = " + b);
    }

    public static void swapFunction(int a1, int b1) {
        System.out.println("До замены: a = " + a1 + " b = " + b1);

        // Передача параметров
        int c = a1;
        a1 = b1;
        b1 = c;
        System.out.println("После замены: a = " + a1 + " b = " + b1 + " c = " + c);
    }
}