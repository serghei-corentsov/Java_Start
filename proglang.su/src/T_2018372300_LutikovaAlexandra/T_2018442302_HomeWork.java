package T_2018372300_LutikovaAlexandra;

public class T_2018442302_HomeWork {
    public static void main(String[] args) {
        String s = "А роза упала на лапу Азора";
        System.out.println(checkPalindrom(s));
//        placeRocks();
        int[][] array = new int[5][5];
        drawMatrix(array);
    }
    public static boolean checkPalindrom(String string){
        String s = string.toLowerCase().replace(" ", "");
        System.out.println(s);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    private static void placeRocks()
    {
        int n = 4;
        int count = 0;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] line0 = new int[n];
            line0[i] = 1;
            array[0] = line0;
            for (int j = 0; j <n ; j++) {
                if(j!=i){
                    int[] line1 = new int[n];
                    line1[j] =2;
                    array[1]= line1;
                    for (int k = 0; k < n; k++) {
                        if(k!=i && k!=j){
                            count++;
                            int[] line2 = new int[n];
                            line2[k]=3;
                            array[2]=line2;
                            for (int l = 0; l <n ; l++) {
                                if(l!=i && l!=j && l!=k) {
                                    int[] line3 = new int[n];
                                    line3[l]=4;
                                    array[3]=line3;
                                }
                            }
                            for (int m = 0; m <n ; m++) {
                                for (int o = 0; o < n; o++) {
                                    System.out.print(array[m][o] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void drawMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j<i && i+j < matrix.length - 1) matrix[i][j] = 1; //левый треугольник
                if(i< matrix.length/2 && j>i && i+j < matrix.length - 1) matrix[i][j] = 2; //верхний треугольник
                if(i> matrix.length/2 && j<i && i+j > matrix.length - 1) matrix[i][j] = 3; //нижний треугольник
                if(j>i && i+j > matrix.length - 1) matrix[i][j] = 4; //правый треугольник
            }
        }
        printArray(matrix);
    }

    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}