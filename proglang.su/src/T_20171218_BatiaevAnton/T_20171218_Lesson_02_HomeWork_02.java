package T_20171218_BatiaevAnton;

import java.util.*;

public class T_20171218_Lesson_02_HomeWork_02 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        int[][] matrix = new int[5][5]; //LutikovaAlexandra T_2018441526_Algorithms_01
        fillDiags(matrix);
        task5();
        shareTreasure(); //LutikovaAlexandra T_2018412246_HomeWork
        task6();

        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(data));
        task7(data, -13);
        System.out.println(Arrays.toString(data));
    }

    private static void task1() {
        int[] data = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; ++i) {
            data[i] = data[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(data) + "\n");
    }
    private static void task2() {
        int[] data = new int[8];
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; ++i) {
            data[i] = i * 3;
        }
        System.out.println(Arrays.toString(data) + "\n");
    }
    private static void task3() {
        int[] data = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; ++i) {
            if (data[i] < 6) data[i] *= 2;
            System.out.print(data[i] + ", ");
        }
        System.out.println("\n");
    }
    private static void task4() {
        int size = 5;
        int[][] data = new int[size][size];
        for (int i = 0; i < size; ++i) {
            data[i][i] = 1; //проставляет 1 с лева на право с верху вних
            data[i][size - i - 1] = 1; //проставляет 1 с права на лево с верху вних
        }
        for (int i = 0; i < size; ++i) {
            System.out.println(Arrays.toString(data[i]));
        }
        System.out.println();
    }
    public static void fillDiags(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j) array[i][j] = 1;
                if(i + j == array.length - 1) array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void task5() {
        int[] data = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = data[0], min = data[0];
        for (int i = 0; i < data.length; ++i) {
            if (min > data[i]) min = data[i];
            if (max < data[i]) max = data[i];
        }
        System.out.println("Max = " + max + ", Min = " + min + "\n");
    }
    public static void shareTreasure(){
        int[] chestTreasure = {12, 200, 14, 76, 197, 3, 201};
        int min = chestTreasure[0], max = chestTreasure[0];
        for(int i : chestTreasure){
            if(min > i) min = i;
            if(max < i) max = i;
        }
        System.out.println("Max: " + max + " Min: " + min + "\n");
    }
    private static boolean task6() {
        int[] data = new int[]{1, 5, 3, 2, 11, 4, 3, 5, 2, 4, 8, 9, 1};
        int leftSum = 0;
        int rightSum = 0;
        for (int aData : data) rightSum += aData;

        for (int val : data) {
            leftSum += val;
            rightSum -= val;
            if (leftSum == rightSum) return true;
        }
        return false;
    }
    private static void task7(int[] data, int shift) {
        shift = shift % data.length;
        if (shift < 0) shift = data.length + shift;

        for (int i = 0; i < shift; ++i) {
            int firstVal = data[0];
            for (int j = 1; j < data.length; ++j) {
                data[j - 1] = data[j];
                System.out.print(data[j] + " "); //Показывает смещение с право на лево по одной цифре
            }
            System.out.println();
            data[data.length - 1] = firstVal;
        }
    }
}
