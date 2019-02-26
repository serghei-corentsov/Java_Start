package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_01_05 {
    //Создание каталогов
    public static void main(String args[]) {
        String nameDir = "/media/csm/Info/Java/javaProjects/proglang.su/testMapRemove";
        File a = new File(nameDir);

        // Создание на диске папки и всех вышестоящих каталогов
        a.mkdirs();
    }
}