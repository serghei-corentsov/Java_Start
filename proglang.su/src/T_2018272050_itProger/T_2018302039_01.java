package T_2018272050_itProger;

public class T_2018302039_01 {
    public static void main(String[] args) {
        T_2018302039_02_Shape[] arr = new T_2018302039_02_Shape[] {new T_2018302039_03_Circle(), new T_2018302039_04_Square(), new T_2018302039_05_Triangle()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
    }
}