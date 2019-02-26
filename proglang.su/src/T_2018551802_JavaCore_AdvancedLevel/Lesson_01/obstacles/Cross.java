package T_2018551802_JavaCore_AdvancedLevel.Lesson_01.obstacles;

import T_2018551802_JavaCore_AdvancedLevel.Lesson_01.participants.Participant;

public class Cross extends Obstacle {
    private int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Participant p) {
        p.run(lenght);
    }
}