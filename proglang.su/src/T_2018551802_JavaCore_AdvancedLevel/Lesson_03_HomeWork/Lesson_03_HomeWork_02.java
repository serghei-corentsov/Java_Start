package T_2018551802_JavaCore_AdvancedLevel.Lesson_03_HomeWork;

import java.util.*;

public class Lesson_03_HomeWork_02 {
//    public static void main(String[] args) {
//        PhoneBook pb = new PhoneBook();
//        pb.add("Ivanov", 1);
//        pb.add("Ivanov", 2);
//        pb.add("Ivanov", 3);
//        pb.add("Ivanov", 4);
//        pb.info("Ivanov");
//    }
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