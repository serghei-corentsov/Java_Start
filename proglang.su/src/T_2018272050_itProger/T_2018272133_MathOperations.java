package T_2018272050_itProger;

import java.util.Scanner;

public class T_2018272133_MathOperations {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Введите первое число: ");
        first = num.nextInt();
        System.out.print("Введите второе число: ");
        second = num.nextInt();
//        result = first + second;
//        result = first - second;
//        result = first * second;
//        result = first / second;
        result = first % second; //остаток от деления, пример: 10-3-3-3=1 вот 1 и есть остаток, 11-3-3-3=2
//        result += 2;
        System.out.println("Результат = " + result);
    }
}