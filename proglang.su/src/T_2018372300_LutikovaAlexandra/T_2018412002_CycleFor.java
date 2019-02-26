package T_2018372300_LutikovaAlexandra;

import java.util.*;

public class T_2018412002_CycleFor {
    public static void main(String[] args){
        //Цикл For
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println();

        for(int i = 0, j = 10; i < j; i++, j--){
            System.out.println(i + " " + j);
        }
        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("i" + i + "-> " + "j" + j + "; ");
            }
            System.out.print("\n");
        }
        System.out.println();

        int[] levels = new int[10];
        for(int i = 0; i < levels.length; i++){
            levels[i] = i+1;
        }
        System.out.println(Arrays.toString(levels));
        System.out.println();

        int[][] matrix = new int[5][6];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[] rewards = {29,11,1307};
        int sum = 0;
        for(int reward : rewards){
            sum += reward;
        }
        System.out.println("Rewards: " + sum + "\n");

        //Цикл For Each
        int[] test = {4,5,10};
        for(int i : test){
            i = 0;
        }
        System.out.println(Arrays.toString(test));
    }
}