package T_20180112_proglang_su.Java10;

public class Test10_02_While {
    public static void main(String args[]) {
        int x = 10;

        while( x < 15 ) {
            System.out.println("Значение x: " + x );
            x++;
        }
        System.out.print("\n\n");
        //дополнительно добавил for
        for (x = 15; x <= 25; x = x + 3) {
            System.out.println("Значение x: " + x);
        }
    }
}