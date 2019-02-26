package T_20180112_proglang_su.Java12;

public class Test12_03 {
    public static void main(String args[]){
        Integer x = 5;
        System.out.println(x.compareTo(8));//Если Integer меньше, чем аргумент, то возвращается -1
        System.out.println(x.compareTo(5));//Если Integer равно аргументу, то возвращается 0
        System.out.println(x.compareTo(3));//Если Integer больше, чем аргумент, то возвращается 1
    }
}