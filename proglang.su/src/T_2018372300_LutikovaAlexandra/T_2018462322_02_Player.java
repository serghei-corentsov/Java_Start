package T_2018372300_LutikovaAlexandra;

public class T_2018462322_02_Player {
    public String name;
    public int level;
    public String playerClass;
    public static int playersCount;

    public T_2018462322_02_Player(String name, int level, String playerClass){
        this.name = name;
        this.level = level;
        this.playerClass = playerClass;
        playersCount++;
    }
    public T_2018462322_02_Player(String name){
        this.name = name;
        playersCount++;
    }
    public T_2018462322_02_Player(int level){
        this.level = level;
        playersCount++;
    }
    public T_2018462322_02_Player(){
    }
    //    public Player(String playerClass){
//        this.name = name;
//    }
    public T_2018462322_02_Player(String name, int level){
        this.name = name;
        this.level = level;
        playersCount++;
    }
    public T_2018462322_02_Player(int level, String playerClass){
        this.level = level;
        this.playerClass = playerClass;
        playersCount++;
    }

    public void info(){
        System.out.println("Player info: " + this.name + " " + this.level + " " + this.playerClass);
    }
    public static void info(T_2018462322_02_Player player){
        System.out.println("Player info: " + player.name + " " + player.level + " " + player.playerClass);
    }
}