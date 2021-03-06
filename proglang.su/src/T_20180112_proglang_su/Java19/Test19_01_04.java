package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_01_04 {
    //Чтение и запись файла
    public static void main(String args[]) {

        try {
            char c[] = {'a','b','c'};
            OutputStream output = new FileOutputStream("file.txt"); // Создание текстового файла
            for(int i = 0; i < c.length; i++) {
                output.write(c[i]); // Запись каждого символа в текстовый файл
            }
            output.close();

            InputStream input = new FileInputStream("file.txt");
            int size = input.available();

            for(int j = 0; j < size; j++) {
                System.out.print((char)input.read() + " "); // Чтение текстового файла посимвольно
            }
            input.close();
        }catch(IOException e) {
            System.out.print("Exception");
        }
    }
}