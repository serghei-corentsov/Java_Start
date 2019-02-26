package T_20180112_proglang_su.Java14;

public class Test14_25 {
    public static void main(String args[]){
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.subSequence(0, 10));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.subSequence(10, 15));
    }
}