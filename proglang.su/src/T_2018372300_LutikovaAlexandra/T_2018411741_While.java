package T_2018372300_LutikovaAlexandra;

public class T_2018411741_While {
    static int characterHealth = 400;
    static int maxHealth = 1000;

    public static void main(String[] args) {
        boolean characterIsPoisoned = true;
        while(characterIsPoisoned){
            decreaseHealth(5);
        }
        while(!characterIsPoisoned){
            if(characterHealth == maxHealth) break;
            increaseHealth(1);
        }
    }
    public static void decreaseHealth(int amount){
        characterHealth -= amount;
    }
    public static void increaseHealth(int amount){
        characterHealth += amount;
    }
}