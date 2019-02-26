package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_03 {
    public static void main(String args[])throws IOException {

        // Запись строки в файл в кодировке UTF-8
        DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("test19_03.txt"));
        dataOutput.writeUTF("Привеь Java");

        // Чтение данных из того же файла
        DataInputStream dataInput = new DataInputStream(new FileInputStream("test19_03.txt"));

        while(dataInput.available() > 0) {
            String a = dataInput.readUTF();
            System.out.print(a);
        }
    }
}