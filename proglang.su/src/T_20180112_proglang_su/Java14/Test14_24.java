package T_20180112_proglang_su.Java14;

public class Test14_24 {
    public static void main(String args[]){
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.startsWith("Добро пожаловать") );

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.startsWith("ProgLang") );

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str.startsWith("ProgLang", 20) );
    }
}