package T_20180112_proglang_su.Java14;

public class Test14_22 {
    public static void main(String args[]){
        String Str1 = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.replaceFirst("(.*)ProgLang(.*)",
                "IAMGROOT" ));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.replaceFirst("ProgLang.su", "IAMGROOT"));

        String Str2 = new String("Добро пожаловать на ProgLang.su! Добро пожаловать на ProgLang.su!");

        System.out.print("Возвращаемое значение: " );
        System.out.println(Str2.replaceFirst("Добро пожаловать на ProgLang.su!", "IAMGROOT!"));
    }
}