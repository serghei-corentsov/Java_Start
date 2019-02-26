package T_20180112_proglang_su.Java14;

public class Test14_16 {
    public static void main(String args[]) {
        String Str = new String("Добро пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        System.out.print("Найденный последний индекс:");
        System.out.println(Str.lastIndexOf('о'));
        System.out.print("Найденный последний индекс: ");
        System.out.println(Str.lastIndexOf('о', 5));
        System.out.print("Найденный последний индекс: ");
        System.out.println(Str.lastIndexOf(SubStr1));
        System.out.print("Найденный последний индекс: ");
        System.out.println(Str.lastIndexOf(SubStr1, 21));
        System.out.print("Найденный последний индекс: " );
        System.out.println(Str.lastIndexOf(SubStr2));
    }
}