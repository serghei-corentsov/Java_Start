package T_20180112_proglang_su.Java05;

public class Employee{
    public static void main(String args[]){
      /* Создание двух объектов с помощью конструктора. */
        Employee empOne = new Employee("Сергей Михайлович");
        Employee empTwo = new Employee("Иван Иванов");

        // Вызов метода для каждого созданного объекта.
        empOne.empAge(32);
        empOne.empDesignation("Старший инженер-программист");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Инженер-программист");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }

    String name;
    int age;
    String designation;

    double salary;
    // Это конструктор класса Employee.
    public Employee(String name){
        this.name = name;        }
    // Присвоение возраста работника переменной age.
    public void empAge(int empAge){
        age =  empAge;
    }
    /* Присвоение переменной designation. */
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* Присвоение переменной salary. */
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    /* Вывод подробной информации. */
    public void printEmployee(){
        System.out.println("Имя:"+ name );
        System.out.println("Возраст:" + age );
        System.out.println("Наименование:" + designation );
        System.out.println("Заработная плата:" + salary);
    }

}