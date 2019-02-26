package T_20180112_proglang_su.Java07;

public class Employee07_01 {
    public static double salary;// salary(зарплата) переменная private static
    public static final String DEPARTMENT = "Разработка ";

    public static void main(String args[]) {
        salary = 2000;
        System.out.println();
        System.out.println(DEPARTMENT + "средняя зарплата: " + salary);
    }
}
