package T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork.obstacles;

import Lesson_01_HomeWork.participants.Participant;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant p) {
        p.swim(length);
    }
}