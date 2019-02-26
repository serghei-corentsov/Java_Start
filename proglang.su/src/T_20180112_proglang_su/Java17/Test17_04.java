package T_20180112_proglang_su.Java17;

import java.util.regex.*;

public class Test17_04 {
    private static String REGEX = "Собака";
    private static String INPUT = "Собака говорит мяу.";
    private static String REPLACE = "Кот";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);

        // получение matcher объекта
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}