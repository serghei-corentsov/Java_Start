package T_2018372300_LutikovaAlexandra;

public class T_2018462322_01_OOP {
    public static void main(String[] args) {
        T_2018462322_02_Player player = new T_2018462322_02_Player("xxxNagibatorxxx", 1, "Warrior");

        int a = 3;
        int b = a;
        b+=4;
        System.out.println("A: " + a + " B: " + b);

        T_2018462322_02_Player player1 = player;

        player1.name = "Dendi";
        System.out.println("T_2018462322_02_Player: " + player.name + " Player1 " + player1.name);

        T_2018462322_02_Player player2 = new T_2018462322_02_Player("Cooler");
        player.info();

        T_2018462322_02_Player.info(player2);
        System.out.println(T_2018462322_02_Player.playersCount);

    }
}