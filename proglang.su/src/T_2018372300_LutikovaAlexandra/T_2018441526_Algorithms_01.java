package T_2018372300_LutikovaAlexandra;

import java.util.*;

public class T_2018441526_Algorithms_01 {
    public static void main(String[] args){
        int[] array = {8, 215, 12, 17, 13, 200};
        sortBarrels(array);
        findMinMax(array);
        int[][] matrix = new int[5][5];
        fillDiags(matrix);
        int[][] matrix2 = new int[7][7];
        fillDiags2(matrix2);
        int[][] matrixForSnail = new int[5][5];
        snailMatrix(matrixForSnail);
    }
    public static void sortBarrels(int[] array){
        int wineCount = 0;
        for(int i : array){
            if(i%2 == 0) wineCount++;
        }
        int[] wineArray = new int[wineCount];
        for(int i = 0, j = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                wineArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(wineArray) + "\n");
    }

    public static void findMinMax(int[] array){
        int min = array[0], max = array[0];
        for(int i : array){
            if(i<min) min = i;
            if(i>max) max = i;
        }
        System.out.println("Max: " + max + " Min: " + min);
        System.out.println("Difference: " + (max - min) + "\n");
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
    public static void fillDiags2(int[][] array){
        for(int i = 0; i < array.length; i++){
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        printArray(array);
        System.out.println();
    }
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void snailMatrix(int[][] array){
        int a = 0;
        int n = array.length;
        int m;
        if(n%2 == 0) m = n/2;
        else m = (n+1)/2;
        for(int i = 0; i < m; i++){
            for(int j = i; j < n - i; j++){ //направо
                array[i][j] = a;
                a++;
            }
            for(int j = i+1; j < n-i; j++){ //вниз
                array[j][n-i-1] = a;
                a++;
            }
            for(int j = n - i - 2; j >= i; j--){//налево
                array[n-i-1][j] = a;
                a++;
            }
            for(int j = n - i -2; j > i; j--){ //вверх
                array[j][i] = a;
                a++;
            }
        }
        printArray(array);
    }
}