package T_20180112_proglang_su.Java20;

import java.io.*;

public class Test20_01_06_01 {
    public static void main(String args[]) {
        try(FileReader fr = new FileReader("test19_01.txt")) {
            char [] array = new char[15];
            fr.read(array);   // чтение содержимого массива
            for(char c : array)
                System.out.print(c);   // вывод символов на экран, один за одним
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}