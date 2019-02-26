package T_20180112_proglang_su.Java18;

public class Test18_07 {//Test18_07 = This_Example;
    // Инициализация переменной num
    int num = 11;

    Test18_07() {
        System.out.println("Это пример программы с ключевым словом this");
    }

    Test18_07(int num) {
        // Вызов конструктора по умолчанию
        this();

        // Присвоение локальной переменной num переменной экземпляра num
        this.num = num;
    }

    public void greet() {
        System.out.println("Привет! Добро пожаловать на ProgLang!");
    }

    public void print() {
        // Локальная переменная num
        int num = 20;

        // Вызов метода класса greet
        this.greet();

        // Вывод локальной переменной.
        System.out.println("Значение локальной переменной num: " + num);

        // Вывод переменной экземпляра.
        System.out.println("Значение переменной экземпляра num: " + this.num);
    }

    public static void main(String[] args) {
        // Инициализация класса
        Test18_07 obj1 = new Test18_07();

        // Вызов метода print
        obj1.print();
        System.out.println();

        // Передача нового значения переменной num через параметризованный конструктор
        Test18_07 obj2 = new Test18_07(30);

        // Вызов снова метода print
        obj2.print();
    }
}