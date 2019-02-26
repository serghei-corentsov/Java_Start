package T_20180112_proglang_su.Java19;

import java.io.*;

public class Test19_01_06 {
    //Список файлов в папке
    public static void main(String[] args) {
        File pathDir = null;
        String[] pathsFilesAndDir;

        try {
            // Создание нового объекта file
            pathDir = new File("/"); // Обязательно должен существовать указанный каталог на диске, иначе программа выдаст ошибку

            // Массив файлов и папок
            pathsFilesAndDir = pathDir.list();

            for(String path:pathsFilesAndDir) {
                // Вывод списка файлов и каталогов
                System.out.println(path);
            }
        }catch(Exception e) {
            // Если произошла ошибка
            e.printStackTrace();
        }
    }
}