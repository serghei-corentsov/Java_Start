package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_01_02 {
    //Символьные потоки
    public static void main(String args[]) throws IOException {
       FileReader fileIn = null;
        FileWriter fileOut = null;

        try {
            fileIn = new FileReader("test19_01");
            fileOut = new FileWriter("test19_01_copied");
            System.out.println("Копия файла создана, данные переносятся...");

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
//            System.out.println("Копия создана успешно, все данные скопированы в новый файл");
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
                System.out.println("Данные скопированы в новый файл");
            }
        }
    }
}