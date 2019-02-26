package T_20180112_proglang_su.Java14;

public class Test14_23 {
    public static void main(String args[]) {
        String Str = new String("Добро-пожаловать-на-ProgLang.su");

        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-")) {
            System.out.println(retval);
        }
    }
}