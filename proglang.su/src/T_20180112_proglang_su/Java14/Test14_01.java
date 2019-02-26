package T_20180112_proglang_su.Java14;

public class Test14_01 {
    public static void main(String args[]) {
        //Пример 1
        String Hi = "Привет Мир!";
        System.out.println("\n" + Hi);

        //Пример 2
        char[] helloArray = { 'П', 'р', 'и', 'в', 'е', 'т', '.'};
        String helloString = new String(helloArray);
        System.out.println("\n" + helloString);

        //Пример 3
        String s = "Я стану отличным программистом!";
        int len = s.length();
        System.out.println("\n" +  "Длина строки: " + len + " символ.");

        //Пример 4
        String string1 = "отличным ";
        System.out.println("\n" +  "Я стану " + string1 + "программистом!");


    }
}