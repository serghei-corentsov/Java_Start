package T_20180112_proglang_su.Java10;

public class Test10_06_Break {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for(int x : numbers ) {
            if( x == 80 ) {
                break;
//                continue;
            }
            System.out.print( x +"\n");
        }
    }
}