package T_20180112_proglang_su.Java14;

public class Test14_20 {
    public static void main(String args[]) {
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.replace('s', 'b'));

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.replace('о', 'а'));
    }
}