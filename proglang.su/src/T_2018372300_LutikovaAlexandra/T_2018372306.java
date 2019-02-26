package T_2018372300_LutikovaAlexandra;

public class T_2018372306 {
    public static void main(String[] args) {
        byte a = 3; //объявление и инициализация
        short b; //объявление
        b = 4;
        int c = 9148723;
        long d = 3249857L;

        float f = 1.45f; //f - обязательно
        double e = 4.24356;

        char ch = 'A'; //одинарные кавычки
        boolean bool = true;

        byte r = 4;
        byte g = (byte)(r + 5); //арифметические операции происходят в 32 и 64 точности

        int q = 6;
        int z = (int) (q + 8L);

        z += 4; //z = z + 4;
        r *= 2;
        e /= 5;

        int inc = 1;
        inc++; // inc = inc + 1; (значение равно 2)

        int inc2 = inc++; //inc2 = 2, inc = 3
        int inc3 = inc--; //inc3 = 3, inc = 2
        int inc4 = ++inc; //inc4 = 3, inc = 3
        int inc5 = --inc; //inc5 = 2, inc = 2
        System.out.println("inc2: " + inc2 + " inc3: " + inc3 + " inc4: " + inc4 + " inc5: " + inc5 + " orig: " + inc);
    }
}