package T_2018372300_LutikovaAlexandra;

public class T_2018392354_HomeWork {
    public static void main(String[] args){
        printLevel(calculateLevel(9287));
    }
    public static int calculateLevel(int exp){
        return exp/1000;
    }
    public static void printLevel(int level){
        System.out.println("Current character level is " + level + "!");
    }
}