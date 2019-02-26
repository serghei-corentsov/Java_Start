package T_20180112_proglang_su.Java07;

public class Test07 {//Локальные переменные в Java
    public void pup1Age(){
        int age = 3;
        age = age + 7;
        System.out.println( age);
    }

    public static void main(String[] args) {
        Test07 test07 = new Test07();
        test07.pup1Age();
    }
}
