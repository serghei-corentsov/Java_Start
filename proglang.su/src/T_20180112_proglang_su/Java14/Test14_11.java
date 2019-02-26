package T_20180112_proglang_su.Java14;

import java.io.*;

public class Test14_11 {
    public static void main(String args[]){
        String Str1 = new String("Добро пожаловать на ProgLang.su");

        try{
            byte[] Str2 = Str1.getBytes();
            System.out.println("Возвращаемое значение: " + Str2);

            Str2 = Str1.getBytes("UTF-8");
            System.out.println("Возвращаемое значение: " + Str2);

            Str2 = Str1.getBytes("ISO-8859-1");
            System.out.println("Возвращаемое значение: " + Str2);

            Str2 = Str1.getBytes("ProgLang.su");
            System.out.println("Возвращаемое значение: " + Str2);
        } catch (UnsupportedEncodingException e){
            System.out.println("Неподдерживаемая кодировка!");
        }
    }
}