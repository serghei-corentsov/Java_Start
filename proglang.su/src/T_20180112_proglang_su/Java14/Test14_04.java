package T_20180112_proglang_su.Java14;

public class Test14_04 {
    public static void main(String args[]) {
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я Буду Хорошим Программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);
    }
}