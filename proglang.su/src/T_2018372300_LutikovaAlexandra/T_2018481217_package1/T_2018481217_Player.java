package T_2018372300_LutikovaAlexandra.T_2018481217_package1;

public class T_2018481217_Player {
    public String attackType;
    public int healthPoints;
    public int manaPoints;
    public int attackAmount;
    public String playerClass;

    public T_2018481217_Player(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        this.attackType = attackType;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.attackAmount = attackAmount;
        System.out.println("Player const");
    }
    public void restoreHealth(int amount) {
        this.healthPoints += amount;
    }
    public void reduceHealth(int amount) {
        this.healthPoints -= amount;
    }
    public void restoreMana(int amount) {
        this.healthPoints += amount;
    }
    public void reduceMana(int amount) {
        this.healthPoints -= amount;
    }
    public void attack(T_2018481217_Player p) {
        p.reduceHealth(this.attackAmount);
        System.out.println(this.playerClass + " attacked " + p.playerClass + " for " + this.attackAmount);
    }
    public void info() {
        System.out.println(this.healthPoints + " " + this.manaPoints);
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if (manaPoints < 0) this.manaPoints = 0;
        this.manaPoints = manaPoints;
    }
}