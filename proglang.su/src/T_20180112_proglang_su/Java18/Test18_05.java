package T_20180112_proglang_su.Java18;

    //Использование аргументов командной строки
public class Test18_05 {
    public static void main(String args[]) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " +  args[i]);
        }
    }
}