package T_2018551802_JavaCore_AdvancedLevel.Lesson_01.obstacles;

import T_2018551802_JavaCore_AdvancedLevel.Lesson_01.participants.Participant;

public class Water extends Obstacle{
    private int lenght;

    public Water(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Participant p) {
        p.swim(lenght);
    }
}