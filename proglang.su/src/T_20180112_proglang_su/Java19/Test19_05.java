package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_05 {
    public static void main(String args[])throws IOException {

        // Запись строки в файл в кодировке UTF-8
        DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("test.txt"));
        dataOutput.writeUTF("Hello Java");

        // Чтение данных из того же файла
        DataInputStream dataInput = new DataInputStream(new FileInputStream("test.txt"));

        while(dataInput.available() > 0) {
            String a = dataInput.readUTF();
            System.out.print(a);
        }
    }
}