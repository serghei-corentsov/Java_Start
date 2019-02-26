package T_20180112_proglang_su.Java14;

public class Test14_12 {
    public static void main(String args[]) {
        String Str1 = new String("Добро пожаловать на ProgLang.su");
        char[] Str2 = new char[7];

        try {
            Str1.getChars(2, 9, Str2, 0);
            System.out.print("Скопированное значение: " );
            System.out.println(Str2);

        } catch (Exception ex) {
            System.out.println("Возникает исключение...");
        }
    }
}