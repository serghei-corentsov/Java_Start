package T_2018272050_itProger;

import java.util.Scanner;

public class T_2018301713_Functions {
//    public static void main(String[] args) {
//        int temp = func(3, 4);
//        System.out.print("Результат " + temp);
//    }
//
//    public static int func(int a, int b) {
//        int result = 1;
//        for (int i = 0; i < b; i++)
//            result *= a;
//            return result;
//        }
//----------------------------------

    //Пример 2
//    public static void main(String[] args) {
//        func(3, 4);
//    }
//
//    public static void func(int a, int b) {
//        int result = 1;
//        for (int i = 0; i < b; i++)
//            result *= a;
//        System.out.println("Результат " + result);
//        }
//----------------------------------

        //Пример 3
    public static void main(String[] args) {
        readArray();
    }

    public static int[] readArray () {
        int[] arr;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте длину масива: ");
        n = sc.nextInt();
        System.out.println("Длина масива: " + n);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i +"] ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}