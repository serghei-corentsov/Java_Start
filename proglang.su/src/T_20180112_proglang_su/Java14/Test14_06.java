package T_20180112_proglang_su.Java14;

public class Test14_06 {
    public static void main(String args[]) {
        String str1 = "Добро пожаловать на ProgLang.su";
        String str2 = "Сайт для изучения программирования";
        StringBuffer str3 = new StringBuffer("Добро пожаловать на ProgLang.su");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean  result = str1.contentEquals(str3);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);

        result = str2.contentEquals(str3);
        System.out.println("Строка \"Сайт для изучения программирования\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);

        result = str1.contentEquals(str4);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать\"? \n" + result);
    }
}