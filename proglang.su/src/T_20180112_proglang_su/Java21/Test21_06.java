package T_20180112_proglang_su.Java21;

public class Test21_06 {
    static class Nested_Demo {
        public void my_method() {
            System.out.println("Это мой вложенный класс");
        }
    }

    public static void main(String args[]) {
        Test21_06.Nested_Demo nested = new Test21_06.Nested_Demo();
        nested.my_method();
    }
}