package T_20180112_proglang_su.Java16;

import java.text.*;
import java.util.*;

public class Test16_02 {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat
//                ("yyyy.MM.dd: HH:mm");
//          ("yyyyDHHmm");
          ("yyyyD");
//          ("yyyyMMdHHmm");
        System.out.println("Текущая дата: " + formatForDateNow.format(dateNow));
    }
}