package T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork.obstacles;

import Lesson_01_HomeWork.obstacles.Obstacle;
import Lesson_01_HomeWork.participants.Participant;
import T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork.participants.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Participant p : team.getParticipants()) {
            for (Obstacle o : obstacles) {
                o.doIt(p);
                if (!p.isOnDistance()) {
                    break;
                }
            }
        }
    }
}