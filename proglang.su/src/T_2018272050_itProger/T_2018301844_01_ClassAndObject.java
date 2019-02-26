package T_2018272050_itProger;

public class T_2018301844_01_ClassAndObject {
    public static void main(String[] args) {
        T_2018301844_02_Person vitya = new T_2018301844_02_Person(120, "Vitya");
//        vitya.height = 120;
        vitya.say("Sergey");
        System.out.println(vitya.name + " рост " + vitya.height + "см");

        T_2018301844_02_Person vlad = new T_2018301844_02_Person();
        System.out.println(vlad.height + "см");

        T_2018301844_02_Person dima = new T_2018301844_02_Person("Dima");
        System.out.println(dima.name);
        System.out.println();

        T_2018302015_Student freshman = new T_2018302015_Student(76, "Viktor", 2);
        freshman.tell();
        T_2018302015_Student fresh = new T_2018302015_Student(190, "Katya", 3);
        fresh.tell();
    }
}