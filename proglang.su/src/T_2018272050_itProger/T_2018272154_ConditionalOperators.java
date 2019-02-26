package T_2018272050_itProger;

import java.util.Scanner;

public class T_2018272154_ConditionalOperators {
    public static void main(String[] args) {
        //Пример 1
        Scanner num = new Scanner(System.in);
        int first, second;
        System.out.print("Введите первое число: ");
        first = num.nextInt();
        System.out.print("Введите первое число: ");
        second = num.nextInt();

        if (first > second) {
            System.out.println("Первое число: " + first + " больше второго: " + second);
        } else if (first < second) {
            System.out.println("Второе число: " + second + " больше первого: " + first);
        } else {
            System.out.println("Введенные числа равны: " + first + " = " + second);
        }

        //Пример 2
//        Scanner num = new Scanner(System.in);
//        int first, second = 50;
//        boolean isTrue = false;
//        System.out.print("Введите первое число: ");
//        first = num.nextInt();
//
//        if (first >= second || isTrue) {
//            System.out.println("Первое число: 10");
//        } else if (first == 45) {
//            System.out.println("Второе число: 45");
//        } else {
//            System.out.println("Число меньше: " + second);
//        }

        //Пример 3
//        Scanner num = new Scanner(System.in);
//        int first, second = 50;
//        boolean isTrue = false;
//        System.out.print("Введите первое число: ");
//        first = num.nextInt();
//
//        isTrue = first == 51;
//
//        if (first >= second && isTrue) {
//            System.out.println("Первое число: 10");
//        } else if (first == 45) {
//            System.out.println("Второе число: 45");
//        } else {
//            System.out.println("Число меньше: " + second);
//        }

        //Пример 4
//        Scanner num = new Scanner(System.in);
//        int first, second = 50;
//        boolean isTrue = false;
//        System.out.print("Введите первое число: ");
//        first = num.nextInt();
//
//        switch (first) {
//            case 51:
//                System.out.println("case: " + first);
//                break;
//            case 61:
//                System.out.println("case: " + first);
//                break;
//            case 71:
//                System.out.println("case: " + first);
//                break;
//            default:
//                System.out.println("Введенное число: = " + first);
//        }
    }
}