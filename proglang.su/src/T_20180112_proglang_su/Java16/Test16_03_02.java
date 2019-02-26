package T_20180112_proglang_su.Java16;

import java.util.*;

public class Test16_03_02 {
    public static void main(String args[]) {
        //Продолжение не работает, если убрать (%<=tB %<=tY) то работает
        // Инициализация объекта date
        Date date = new Date();
        // Вывод отформатированной даты (удалите знак = ниже из кода, а то у меня конфликтует этот код с html)
        System.out.printf("%s %te %<=tB %<=tY", "Сегодняшняя дата:", date);
    }
}