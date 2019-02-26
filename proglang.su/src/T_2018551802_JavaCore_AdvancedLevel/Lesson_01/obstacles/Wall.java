package T_2018551802_JavaCore_AdvancedLevel.Lesson_01.obstacles;

import T_2018551802_JavaCore_AdvancedLevel.Lesson_01.participants.Participant;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant p) {
        p.jump(height);
    }
}