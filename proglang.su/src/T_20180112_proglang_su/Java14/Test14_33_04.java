package T_20180112_proglang_su.Java14;

public class Test14_33_04 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("абвгдеёжз");
        sb.insert(3,"123");
        System.out.println(sb);
    }
}