package T_20180112_proglang_su.Java14;

public class Test14_08 {
    public static void main(String args[]){
        String Str = new String("Добро пожаловать на ProgLang.su");
        boolean retVal;

        retVal = Str.endsWith("ProgLang.su");
        System.out.println("Возвращаемое значение: " + retVal);

        retVal = Str.endsWith("ProgLang");
        System.out.println("Возвращаемое значение: " + retVal);
    }
}