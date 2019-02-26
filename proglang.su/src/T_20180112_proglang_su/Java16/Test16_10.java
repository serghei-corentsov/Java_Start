package T_20180112_proglang_su.Java16;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test16_10 {
    public static void main(String args[]) {
        String date = "2018.01.23";

        // Переводим строку в дату
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date dayWeek = null;
        try {
            dayWeek = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Вывод дня недели даты на экран
        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
    }
}