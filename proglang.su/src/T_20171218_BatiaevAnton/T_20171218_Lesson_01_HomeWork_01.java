package T_20171218_BatiaevAnton;

public class T_20171218_Lesson_01_HomeWork_01 {
    public static void main(String[] args) {
        int a = 5;
        double calculate = calculate(1, 2, 3, 4);
        System.out.println(calculate);
        boolean answerT3 = test3(6,9);
        System.out.println(answerT3);
        boolean answerT4 = test4(7);
        System.out.println(answerT4);
        String answerT5 = test5("Сергей");
        int answerT6 = test6(2000);
    }

    private static double calculate(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }
    private static boolean test3(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum < 20;
    }
    private static boolean test4(int a) {
        return a <= 0;
    }
    private static String test5(String name) {
        System.out.println("Привет " + name + "!");
        return name;
    }
    private static int test6(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0)) {
            System.out.println("Високосный " + year+"г");
        } else {
            System.out.println("Не високосный " + year+"г");
        }
        return year;
    }
}