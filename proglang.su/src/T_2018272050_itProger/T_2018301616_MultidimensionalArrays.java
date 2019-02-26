package T_2018272050_itProger;

public class T_2018301616_MultidimensionalArrays {
    public static void main(String[] args) {
        char[][] array = new char[8][5];
        for (int i = 0; i < array.length; i++) {
            array[3][0] = 'c';
            System.out.println(array[3][0]);
        }
    }
}