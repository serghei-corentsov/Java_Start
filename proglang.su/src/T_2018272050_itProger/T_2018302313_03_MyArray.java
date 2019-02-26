package T_2018272050_itProger;

public class T_2018302313_03_MyArray implements T_2018302313_02_Array {
    int a[] = new int[4];
    int size = 0;

    @Override
    public int Get(int i) {
        return a[i];
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