package T_2018272050_itProger;

public class T_2018302313_04_Array1 implements T_2018302313_02_Array{
    int a[] = new int[4];
    int size = 0;

    @Override
    public int Get(int i) {
        if (i < a.length) {
            return a[a.length - i - 1];
        }else
            return a[0];
    }

    @Override
    public boolean Add(int val) {
        if (size != a.length) {
            a[size] = val;
            size++;
            return true;
        }else
            return false;
    }
}