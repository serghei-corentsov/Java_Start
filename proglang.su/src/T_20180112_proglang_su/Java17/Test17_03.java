package T_20180112_proglang_su.Java17;

import java.util.regex.*;

public class Test17_03 {
    private static final String REGEX = "Pro";
    private static final String INPUT = "ProgLang";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main( String args[] ) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Текущее регулярное выражение: " + REGEX);
        System.out.println("Текущие входные данные: " + INPUT);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
    }
}