package T_20171218_BatiaevAnton;

import java.util.*;

public class T_20171218_Lesson_02 {
    private static void test1() {
        int[][] data = new int[5][];
        int row = 1;
        data[row] = new int[6];
        data[1] = new int[3];
        data[2] = new int[8];
        data[3] = new int[15];

        data[1][0] = 2;
        data[1][2] = 2;

        int[] values = {1,2,4};
        System.out.println();
    }


    private static int[] data = new int[7];
    public static void main(String[] args) {
//        test1();
        for (int i = 3; i <10; i++) {
            System.out.println(getExcelData(i));
        }
    }
    private static int getExcelData(int column) {
        return data[column - 3];
    }
}