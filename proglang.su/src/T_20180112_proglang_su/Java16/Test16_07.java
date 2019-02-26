package T_20180112_proglang_su.Java16;

import java.util.*;
import java.util.concurrent.*;

public class Test16_07 {
    public static void main(String args[]) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");

            TimeUnit.SECONDS.sleep(3);
            System.out.println(new Date() + "\n");

            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Разница между датами: " + diff + " миллисекунд");
        }catch (Exception e) {
            System.out.println("Получили исключение!");
        }
    }
}