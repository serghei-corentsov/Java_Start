package T_2018372300_LutikovaAlexandra;

import java.util.*;

public class T_2018412246_HomeWork {
    public static void main(String[] args) {
        feedZombies();
        shareTreasure();
        fillMap();
        expFountain();
    }

    public static void feedZombies(){
        int[] dates =  {1976, 1989, 1965, 1990, 1988, 1995, 1993};
        for(int i = 0; i < dates.length; i++){
            if(dates[i] % 2 != 0) dates[i] = 0;
        }
        System.out.println(Arrays.toString(dates) + "\n");
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
    public static void fillMap(){
        int[][] map = new int[5][5];
        int counter = 1;
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                map[i][j] = counter;
                counter++;
            }
        }
        System.out.println(Arrays.deepToString(map) + "\n");
    }
    public static void expFountain(){
        int characterExp = 450;
        do{
            characterExp++;
        }while(characterExp < 300);
        System.out.println(characterExp);
    }
}