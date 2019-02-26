package T_2018372300_LutikovaAlexandra;

public class T_2018411403 {
    public static boolean isMage;
    public static boolean isWarrior;
    public static int classNum;
    public static int charLevel;
    public static int playerCoins;
    public static boolean player1IsMage;
    public static boolean player2IsMage;
    public static int mana;
    public static void main(String[] args) {
        isMage = false;
        isWarrior = true;
        classNum = 1;
        charLevel = 3;
        player1IsMage = true;
        player2IsMage = false;
//        playerCoins = 10000;
        if(classNum == 1){
            showMageSkills();
        }
        else{
            showWarriorSkills();
        }
        if(classNum == 1 && charLevel > 5) giveNewMageSkill();
        else if(classNum == 2 && charLevel > 5) giveNewWarriorSkill();

        if(classNum == 1 && (charLevel > 5 || playerCoins > 1000)) giveNewMageSkill();
        else giveNewWarriorSkill();
        if(!isWarrior){
            showMageSkills();
        }
        else{
            showWarriorSkills();
        }
        if(player1IsMage^player2IsMage) openDungeon();
        else showWarning();

        if(isMage) mana = 500;
        else mana = 100;

        mana = isMage ? 500 : 100; //тернарный оператор

        String playerName = "Roilen";
        String guildName = "RGB";
        String fullName = playerName + " " + guildName;
        System.out.println(fullName);

        String coinsFound = 5 + 5 + " coins found"; //10 coins found
        String coinsFound2 = "T_2018462322_02_Player found " + (5 + 5) + " coins";
        System.out.println(coinsFound);
        System.out.println(coinsFound2);


    }
    public static void showMageSkills(){
        System.out.println("Some magic!");
    }
    public static void showWarriorSkills(){
        System.out.println("Some strength!");
    }
    public static void giveNewMageSkill(){
        System.out.println("New Mage Skill gained");
    }
    public static void giveNewWarriorSkill(){
        System.out.println("New Warrior Skill gained");
    }
    public static void openDungeon(){
        System.out.println("Dungeon opened!");
    }
    public static void showWarning(){
        System.out.println("Two same classes!");
    }
}