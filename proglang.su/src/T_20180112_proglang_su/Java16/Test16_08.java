package T_20180112_proglang_su.Java16;

import java.text.*;
import java.util.*;

public class Test16_08 {
    public static void main(String args[]) {
        String date1 = "2016.03.01";
        String date2 = "2016.02.01";

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Количество дней между датами в миллисекундах
        long difference = dateOne.getTime() - dateTwo.getTime();
        // Перевод количества дней между датами из миллисекунд в дни
        int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        // Вывод разницы между датами в днях на экран
        System.out.println(days + " дн.");
    }
}