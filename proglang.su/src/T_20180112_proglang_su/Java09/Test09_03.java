package T_20180112_proglang_su.Java09;

public class Test09_03 {

    public static void main(String args[]){
        int a , b;
        a = 10;
        b = (a == 1) ? 20 : 30; //если условие true выводит первое значение 20 если false второе 30, в данном случае условие false выводит 30
        System.out.println();
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );
        System.out.println();


        String name = "Олег";
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println( result );
    }
}
