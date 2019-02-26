package Lesson_01_HomeWork.obstacles;

import Lesson_01_HomeWork.participants.Participant;

public class Water extends Obstacle {
    private int lenght;

    public Water(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Participant p) {
        p.swim(lenght);
    }
}