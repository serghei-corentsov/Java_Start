package T_2018372300_LutikovaAlexandra;

import java.util.*;

public class T_2018412330_MoreArray {
    public static void main(String[] args) {
        int[][][][] map = new int[4][1][2][3];
        int counter = 1;
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                for (int k = 0; k < map[i].length; k++) {
                    for (int l = 0; l < map[i].length; l++) {
                        map[i][j][k][l] = counter;
                        counter++;
                        System.out.println(Arrays.deepToString(map));
                    }
                }
            }
        }
    }
}