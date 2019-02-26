package T_2018372300_LutikovaAlexandra.T_2018481217_package2;

import T_2018372300_LutikovaAlexandra.T_2018481217_package1.T_2018481217_Player;

public class T_2018481217_Priest extends T_2018481217_Player{
    public T_2018481217_Priest(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        super(attackType, healthPoints, manaPoints, attackAmount);
        this.playerClass = "Priest";
    }
}