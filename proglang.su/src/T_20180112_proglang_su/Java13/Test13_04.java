package T_20180112_proglang_su.Java13;

public class Test13_04 {
    public static void main(String args[]){
        System.out.println("Значение \" \" (пробел) пустое пространство? Ответ: " + Character.isWhitespace(' '));
        System.out.println("Значение \"\\n\" (новая строка) пустое пространство? Ответ: " + Character.isWhitespace('\n'));
        System.out.println("Значение \"\\t\" (табуляция) пустое пространство? Ответ: " + Character.isWhitespace('\t'));
        System.out.println("Значение \"1\" пустое пространство? Ответ: " + Character.isWhitespace('1'));
        System.out.println("Значение \"p\" пустое пространство? Ответ: " + Character.isWhitespace('p'));
        System.out.println("Значение \"&\" пустое пространство? Ответ: " + Character.isWhitespace('&'));
    }
}