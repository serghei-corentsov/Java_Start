package T_20180112_proglang_su.Java11;

public class Test11_03_ifElse {
    public static void main(String args[]){
        int x = 30;

//        if( x < 20 ){
//            System.out.println("\n" + "Выполнен if");
//        }else{
//            System.out.println("\n" + "Выполнен else");
//        }

//        if( x == 10 ){
//            System.out.println("Значение X = 10");
//        }else if( x == 20 ){
//            System.out.println("Значение X = 20");
//        }else if( x == 30 ){
//            System.out.println("Значение X = 30");
//        }else{
//            System.out.println("Это оператор else");
//        }
        //пример того что выше но в упрощеном варианте
        if (x == 10 ? x == 20 : x == 30) {
            System.out.println("\n" + "X = " + x);
        } else {
            System.out.println("if нет совпадения");
        }
    }
}