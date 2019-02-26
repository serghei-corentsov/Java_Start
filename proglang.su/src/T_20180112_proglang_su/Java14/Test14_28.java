package T_20180112_proglang_su.Java14;

import java.util.*;

public class Test14_28 {
    public static void main(String args[]){
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toLowerCase());

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toLowerCase(Locale.ENGLISH));
    }
}