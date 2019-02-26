package T_2018551802_JavaCore_AdvancedLevel.Lesson_02_HomeWork;

public class Lesson_02_HomeWork {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
            };
        try {
            System.out.println(calc(arr));
        } catch (MyDataException e) {
            e.printStackTrace();
        } catch (MySizeException e) {
            e.printStackTrace();
        }
    }

    public static int calc(String[][] arr) {
        int sum = 0;
        if (arr.length != 4) {
            throw  new MySizeException();
        }
        for (int i = 0; i < arr.length; i++) { //бегаем по строкам
            if (arr[i].length != 4) {
                throw new MySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) { //бегаем по элементам одной строки
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyDataException(j, i);
                }
            }
        }
        return sum;
    }
}