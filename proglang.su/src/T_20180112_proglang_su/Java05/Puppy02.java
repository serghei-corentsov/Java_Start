package T_20180112_proglang_su.Java05;

public class Puppy02 {

    int puppy02Age;

    public Puppy02(String name){
        System.out.println("Привет: " + name);
    }
    public void setAge(int age){
        puppy02Age = age;
    }
    public int getAge(){
        System.out.println("Возраст щенка: " + puppy02Age);
        return puppy02Age;
    }

    public static void main(String[] args) {
        Puppy02 myPuppy02 = new Puppy02("Барсик");
        myPuppy02.setAge(2);
        myPuppy02.getAge();
        System.out.println("q: " +myPuppy02.puppy02Age);
    }
}
