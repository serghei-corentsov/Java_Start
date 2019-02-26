package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_07 {
    public static void main(String args[])throws IOException {
        File file = new File("Example.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);

        // Запись содержимого в файл
        writer.write("Это простой пример,\n в котором мы осуществляем\n с помощью языка Java\n запись в файл\n и чтение из файла\n");
        writer.flush();
        writer.close();

        // Создание объекта FileReader
        FileReader fr = new FileReader(file);
        char [] a = new char[200];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив

        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        fr.close();
    }
}