package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_06 {
    public static void main(String[] args) {
        File f = null;
        String[] strs = {"test19_01", "Second.txt"};
        try {
            // для каждой строки в массиве строк
            for(String s:strs ) {
                // создание нового файла
                f = new File(s);

                // true, если файл является исполняемым
                boolean bool = f.canExecute();

                // нахождение абсолютного пути
                String a = f.getAbsolutePath();

                // вывод абсолютного пути
                System.out.print(a);

                // вывод
                System.out.println(" исполняется: " + bool);
            }
        } catch (Exception e) {
            // если любая ошибка ввода/вывода
            e.printStackTrace();
        }
    }
}