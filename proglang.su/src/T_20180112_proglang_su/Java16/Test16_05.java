package T_20180112_proglang_su.Java16;

import java.util.*;
import java.util.concurrent.*;

public class Test16_05 {
    public static void main(String args[]) {
        try {
            System.out.println(new Date() + "\n");
            TimeUnit.SECONDS.sleep(10); // Замораживает весь поток на 10 секунд
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Получили исключение!");
        }
    }
}