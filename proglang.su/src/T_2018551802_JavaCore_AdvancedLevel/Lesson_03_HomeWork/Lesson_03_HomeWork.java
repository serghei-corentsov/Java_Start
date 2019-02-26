package T_2018551802_JavaCore_AdvancedLevel.Lesson_03_HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Lesson_03_HomeWork {
    public static void main(String[] args) {
        //example_1
        String[] arr = {"A", "B", "A", "A", "B", "C", "D", "A", "B"};
        HashSet<String> hs = new HashSet<>(Arrays.asList(arr));
        System.out.println(hs);

        //example_2
        HashMap<String, Integer> hm = new HashMap<>();
        for (String o : arr) {
            hm.put(o, hm.getOrDefault(o, 0) + 1);
        }
        System.out.println(hm.keySet());
        System.out.println(hm);

//        PhoneBook pb = new PhoneBook();
//        pb.add("Ivanov", 1);
//        pb.add("Ivanov", 2);
//        pb.add("Ivanov", 3);
//        pb.add("Ivanov", 4);
//        pb.info("Ivanov");
    }

    //PhoneBook
    static class PhoneBook {
        HashMap<String, Set<String>> book;
        public PhoneBook() {
            book = new HashMap<>();
        }
        public void add(String name, String phone) {
            if (!book.containsKey(name)) {
                book.put(name, new HashSet<>());
            }
            book.get(name).add(phone);
        }
        public void info(String name) {
            System.out.println(book.get(name));
        }
    }
}