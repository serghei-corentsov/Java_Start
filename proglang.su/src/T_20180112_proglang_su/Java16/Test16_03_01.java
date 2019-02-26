package T_20180112_proglang_su.Java16;

import java.util.*;

public class Test16_03_01 {
    public static void main(String args[]) {
        // Инициализация объекта date
        Date date = new Date();
        // Вывод текущей даты с использованием toString()
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Дата:", date);
    }
}