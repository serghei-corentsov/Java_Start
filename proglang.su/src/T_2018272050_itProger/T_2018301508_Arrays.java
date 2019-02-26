package T_2018272050_itProger;

import java.util.Scanner;

public class T_2018301508_Arrays {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте длину масива: ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите a[" + i + "] = ");
            a[i] = sc.nextInt();
//            if (a[i] % 2 != 0) {
//                continue;
//            }
//            System.out.print("Введите a[" + i + "] = ");
        }
    }
}