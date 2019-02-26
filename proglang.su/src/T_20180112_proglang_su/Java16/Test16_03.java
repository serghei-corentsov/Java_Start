package T_20180112_proglang_su.Java16;

import java.util.*;

public class Test16_03 {
    public static void main(String args[]) {
        // Инициализация объекта date
        Date date = new Date();
        // Вывод текущей даты и времени с использованием toString()
        String str = String.format("Текущая дата и время: %tc", date);
        System.out.printf(str);
    }
}