package T_2018372300_LutikovaAlexandra.T_2018481217_package1;

public class T_2018481217_Warrior extends T_2018481217_Player{
    public T_2018481217_Warrior(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        super(attackType, healthPoints, manaPoints, attackAmount);
        this.playerClass = "Warrior";
        System.out.println("Warrior const");
    }

    @Override
    public void info() {
        System.out.println("Warrior info: ");
        super.info();
    }
}