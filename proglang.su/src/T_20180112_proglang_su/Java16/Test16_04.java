package T_20180112_proglang_su.Java16;

import java.text.*;
import java.util.*;

public class Test16_04 {
    public static void main(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String str = args.length == 0 ? "2018-01-01" : args[0];

        System.out.print("Строка " + str + " распаршена как ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
    }
}