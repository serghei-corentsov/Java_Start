package Lesson_01_HomeWork.obstacles;

import Lesson_01_HomeWork.participants.Participant;

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