package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_01_03 {
    //Стандартные потоки
    public static void main(String args[]) throws IOException {
        InputStreamReader inStRe = null;

        try {
            inStRe = new InputStreamReader(System.in);
            System.out.println("символ 'q' для выхода. \nВведите текст:");
            char a;
            do {
                a = (char) inStRe.read();
                System.out.print(a);
            } while(a != 'q');
        }finally {
            if (inStRe != null) {
                inStRe.close();
            }
        }
    }
}