package T_20180112_proglang_su.Java07;

public class Employee07 {//Переменные экземпляра
    public String name;// Переменная экземпляра открыта для любого дочернего класса
    private double salary;// Переменная salary видна только в Employee07

    public Employee07(String empName){// Имя переменной присваивается в конструкторе
        name = empName;
    }

    public void setSalary(double empSal){// Переменной salary присваивается значение
        salary = empSal;
    }

    public void printEmp(){// Этот метод выводит на экран данные сотрудников
        System.out.println();
        System.out.println("Имя: " + name);
        System.out.println("Зарплата: " +salary);
    }

    public static void main(String args[]){
        Employee07 empOne = new Employee07("Сергей");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
