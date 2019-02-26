package T_20180112_proglang_su.Java14;

public class Test14_33_03 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("абвгдеёжз");
        sb.delete(3,7);
        System.out.println(sb);
    }
}