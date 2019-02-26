package T_20180112_proglang_su.Java20;

import java.io.*;

public class Test20_01_06 {
    public static void main(String args[]) {
        FileReader fr = null;
        try {
            File f = new File("test19_01.txt"); //фаил должен существовать дабы код сработал
            fr = new FileReader(f);
            char [] array = new char[15]; //указывает количество выводимых символов
            fr.read(array);   // чтение содержимого массива
            for(char c : array)
                System.out.print(c);   // вывод символов на экран, один за одним
        }catch(IOException e1) {
            e1.printStackTrace();
        }finally {
            try {
                fr.close();
            }catch(IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}