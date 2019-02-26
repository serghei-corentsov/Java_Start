package T_2018372300_LutikovaAlexandra;

public class T_2018411558_HomeWork {
    public static void main(String[] args) {
        System.out.println(openDungeon(10,12,12));
        System.out.println(shouldIOpenDungeon(15,25,25));
    }
    public static void classPicker(int classNum){
        switch(classNum){
            case 1:
                System.out.println("Выбран класс воин");
                break;
            case 2:
                System.out.println("Выбран класс маг");
                break;
            case 3:
                System.out.println("Выбран класс лучник");
                break;
            case 4:
                System.out.println("Выбран класс убийца");
                break;
            case 5:
                System.out.println("Выбран класс чернокнижник");
                break;
            case 6:
                System.out.println("Выбран класс шаман");
                break;
            case 7:
                System.out.println("Выбран класс паладин");
                break;
            case 8:
                System.out.println("Выбран класс скаут");
                break;
            case 9:
                System.out.println("Выбран класс лекарь");
                break;
            case 10:
                System.out.println("Выбран класс бард");
                break;
            default:
                System.out.println("Такого класса нет!");
        }
    }
    public static void giveReward(int characterLevel){
        if(characterLevel%5 == 0) System.out.println("Выдана награда");
    }
    public static boolean openDungeon(int player1Lvl,int player2Lvl,int player3Lvl){
        int maxLevel = (player1Lvl > player2Lvl && player1Lvl > player3Lvl) ? player1Lvl : (player2Lvl > player1Lvl && player2Lvl > player3Lvl) ? player2Lvl : player3Lvl;
        int minLevel = (player1Lvl < player2Lvl && player1Lvl < player3Lvl) ? player1Lvl : (player2Lvl < player1Lvl && player2Lvl < player3Lvl) ? player2Lvl : player3Lvl;
        if((player1Lvl >= 10 && player2Lvl >= 10 && player3Lvl >= 10) && (maxLevel - minLevel) <= 3) return true;
        return false;
    }
    public static boolean shouldIOpenDungeon (int min,int max,int playerLvl){
        if(playerLvl < min || playerLvl > max) return false;
        return true;
    }
}