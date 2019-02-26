package T_20180112_proglang_su.Java05;

public class Puppy {

    public Puppy(String name){
        // Это конструктор и у него один параметр, name.
        System.out.println("Ваше имя: " + name);
    }

    public static void main(String[] args) {
        // Создание объекта myPuppy.
        Puppy myPuppy = new Puppy("Барс");
    }
}
