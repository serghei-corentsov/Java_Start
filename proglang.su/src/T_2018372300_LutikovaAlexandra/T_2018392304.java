package T_2018372300_LutikovaAlexandra;

public class T_2018392304 {
    static int classVariable = 0;
    public static void main(String[] args){
        System.out.println("Hello, World!");
        // выводит в консоль фразу Hello, World!
//        int newLevel = levelUp(5);
//        System.out.println(newLevel);
        System.out.println("New level: " + levelUp(5));
        int lvl = levelUp(66);
        System.out.println(lvl);
        classVariable = 5;
    }
    public static int levelUp(int lvl){
        classVariable +=1;
        return lvl+1;
    }
}