package T_2018551802_JavaCore_AdvancedLevel.Lesson_04;

import java.util.*;

public class T_2018651738_01 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("A", "BB", "AAA", "B",  "DD", "CCCC"));
        System.out.println(str + " Оригинал");
        //V.1
        Collections.sort(str);
        System.out.println(str + " Сортировка по алфавиту");
        //V.2
//        Collections.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return 1;
//                }
//                if (o1.length() < o2.length()) {
//                    return -1;
//                }
//                return 0;
//            }
//        });
//        System.out.println(str + " Сортировка по алфавиту и размеру");
        //V.2.1
//        Collections.sort(str, (o1, o2) -> {
//            if (o1.length() > o2.length()) {
//                return 1;
//            }
//            if (o1.length() < o2.length()) {
//                return -1;
//            }
//            return 0;
//        });
//        System.out.println(str + " Сортировка по алфавиту и размеру");
//    }
        //V.2.2
    Collections.sort(str, (o1, o2) -> {
        return o1.length() - o2.length();
    });
        System.out.println(str + " Сортировка по алфавиту и размеру");
    }
        //V.2.2.1 есть дополнительные скобки ()
//    Collections.sort(str, (o1, o2) -> {
//        return (o1.length() - o2.length());
//    });
//        System.out.println(str + " Сортировка по алфавиту и размеру");
//    }
        //V.2.3
//        Collections.sort(str, (o1, o2) -> {
//            return -(o1.length() - o2.length());
//        });
//        System.out.println(str + " Сортировка по размеру и алфавиту");
        //V.2.3.1
//        Collections.sort(str, (o1, o2) -> {
//            return -o1.length() - o2.length();
//        });
//        System.out.println(str + " Сортировка по размеру и алфавиту в обратном порядке: Я -> A");
//    }
}