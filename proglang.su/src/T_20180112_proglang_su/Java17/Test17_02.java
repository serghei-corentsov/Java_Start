package T_20180112_proglang_su.Java17;

import java.util.regex.*;

public class Test17_02 {
    private static final String REGEX = "\\bкот\\b";
    private static final String INPUT = "кот кот кот котёл кот";

    public static void main( String args[] ) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // получение matcher объекта
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Номер вхождения: "+count);
            System.out.println("Начальная позиция вхождения: "+m.start());
            System.out.println("Конечная позиция вхождения: "+m.end());
        }
    }
}