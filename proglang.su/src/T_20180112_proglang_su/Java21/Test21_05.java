package T_20180112_proglang_su.Java21;

// Интерфейс
interface Message {
    String greet();

    public class Test21_05 {
        // Метод, который принимает объект интерфейса Message
        public void displayMessage(Message m) {
            System.out.println(m.greet() +
                    ", это пример анонимного внутреннего класса в качестве аргумента");
        }

        public static void main(String args[]) {
            // Создание класса
            Test21_05 obj = new Test21_05();

            // Передача анонимного внутреннего класса в качестве аргумента
            obj.displayMessage(new Message() {
                public String greet() {
                    return "Привет";
                }
            });
        }
    }
}