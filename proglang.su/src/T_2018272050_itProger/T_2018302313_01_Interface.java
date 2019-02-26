package T_2018272050_itProger;

public class T_2018302313_01_Interface {
    public static void main(String[] args) {
        T_2018302313_02_Array a = new T_2018302313_03_MyArray();
        System.out.println(a.Add(3));
        System.out.println(a.Add(23));
        System.out.println(a.Add(34));
        System.out.println(a.Add(7));
        System.out.println(a.Add(8));
        System.out.println(a.Get(3));
        System.out.println();

        T_2018302313_02_Array b = new T_2018302313_04_Array1();
        System.out.println(b.Add(3));
        System.out.println(b.Add(23));
        System.out.println(b.Add(34));
        System.out.println(b.Add(7));
        System.out.println(b.Get(2));

    }
}