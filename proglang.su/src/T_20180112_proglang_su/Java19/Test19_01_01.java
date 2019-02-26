package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_01_01 {
    //Байтовый поток //чтобы скопировать файл, необходимо в папке проекта создать файл file.txt с любым или пустым содержимым
    public static void main(String args[]) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("test19_01.txt");
            fileOut = new FileOutputStream("test19_01_copied.txt");
            System.out.println("Копия файла создана, данные переносятся...");

            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
            }
            System.out.println("Данные скопированы в новый файл");
        }finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
            System.out.println("Копия создана успешно, все данные скопированы в новый файл");
        }
    }
}