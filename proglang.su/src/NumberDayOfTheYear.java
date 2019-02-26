import java.text.SimpleDateFormat;
import java.util.Date;

public class NumberDayOfTheYear {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat
                ("yyyyMMdHHmm"); // год, месяц, число, часы, минуты
//                ("yyyyDHHmm"); // год, день года (пример 330д с 1-го), часы, минуты
        System.out.println("Текущая дата: " + formatForDateNow.format(dateNow));
    }
}