package T_20180112_proglang_su.Java17;

import java.util.regex.*;

public class Test17_05 {
    private static String REGEX = "а*д";
    private static String INPUT = "аадProgLangааадProgLangадProgLangд";
    private static String REPLACE = "-";
    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);

        // получение matcher объекта
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}