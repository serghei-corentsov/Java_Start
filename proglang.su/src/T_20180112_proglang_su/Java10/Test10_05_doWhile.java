package T_20180112_proglang_su.Java10;

public class Test10_05_doWhile {
    public static void main(String args[]){
        int x = 10;

        do{
            System.out.print("Значение х: " + x );
            x++;
            System.out.print("\n");
        } while( x < 15 );
    }
}