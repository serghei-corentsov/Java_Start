package T_20180112_proglang_su.Java14;

public class Test14_19 {
    public static void main(String args[]) {
        String Str1 = new String("Добро пожаловать на ProgLang.su");
        String Str2 = new String("ProgLang");
        String Str3 = new String("PROGLANG");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.regionMatches(20, Str2, 0, 8));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.regionMatches(20, Str3, 0, 8));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.regionMatches(true, 20, Str3, 0, 8));
    }
}