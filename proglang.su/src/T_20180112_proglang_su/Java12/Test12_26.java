package T_20180112_proglang_su.Java12;

public class Test12_26 {
    public static void main(String args[]){
        double a = 90.0;
        double b = 45.0;
        double c = 0.017453;

        System.out.format("%.1f радиан = %.3f градусов %n", a, Math.toDegrees(a));
        System.out.format("%.1f радиан = %.3f градусов %n", b, Math.toDegrees(b));
        System.out.format("%.6f радиан = %.5f градусу %n", c, Math.toDegrees(c));
    }
}