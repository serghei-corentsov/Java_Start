package T_2018372300_LutikovaAlexandra.T_2018481217_package1;

import java.util.Objects;

public class T_2018481217_Potion {
    public String type;
    public int volume;
    public String strength;
    public String color;

    public T_2018481217_Potion(String type, int volume, String strength, String color) {
        this.type = type;
        this.volume = volume;
        this.strength = strength;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        T_2018481217_Potion that = (T_2018481217_Potion) o;

        if (volume != that.volume) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return strength != null ? strength.equals(that.strength) : that.strength == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, volume, strength);
//        int result = type != null ? type.hashCode() : 0;
//        result = 31 * result + volume;
//        result = 31 * result + (strength != null ? strength.hashCode() : 0);
//        return result;
    }

    @Override
    public String toString() {
        return "T_2018481217_Potion{" + "type='" + type + '\'' + ", volume=" + volume + ", strength='" + strength + '\'' + ", color='" + color + '\'' + '}';
    }
}