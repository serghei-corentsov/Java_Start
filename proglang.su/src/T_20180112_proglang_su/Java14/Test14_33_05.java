package T_20180112_proglang_su.Java14;

public class Test14_33_05 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("абвгдеёжз");
        sb.replace(3, 6, "ProgLang");
        System.out.println(sb);
    }
}