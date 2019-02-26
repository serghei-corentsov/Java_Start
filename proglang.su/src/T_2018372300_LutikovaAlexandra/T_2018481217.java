package T_2018372300_LutikovaAlexandra;

import T_2018372300_LutikovaAlexandra.T_2018481217_package1.*;

public class T_2018481217 {
    public static void main(String[] args) {
        T_2018481217_Warrior warrior = new T_2018481217_Warrior("close", 500,100,75);
        warrior.attackAmount = 100;
        warrior.info();
        T_2018481217_Mage mage = new T_2018481217_Mage("rended", 300, 500, 150);
        warrior.attack(mage);
        T_2018481217_Potion hp = new T_2018481217_Potion("Health", 500, "minor", "blue");
        T_2018481217_Potion hp2 = new T_2018481217_Potion("Health", 500, "minor", "red");
        System.out.println(hp == hp2);
        System.out.println(hp.equals(hp2));
        System.out.println(hp.hashCode());
        System.out.println(hp2.hashCode());
        System.out.println(hp);
    }
}