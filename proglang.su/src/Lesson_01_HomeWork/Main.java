package Lesson_01_HomeWork;


import Lesson_01_HomeWork.obstacles.Water;
import Lesson_01_HomeWork.obstacles.Cross;
import Lesson_01_HomeWork.obstacles.Obstacle;
import Lesson_01_HomeWork.obstacles.Wall;
import Lesson_01_HomeWork.participants.Cat;
import Lesson_01_HomeWork.participants.Dog;
import Lesson_01_HomeWork.participants.Human;
import Lesson_01_HomeWork.participants.Participant;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Cat("Barsik"), new Dog("Bobik"), new Human("Bob")};
        Obstacle[] obstacles = {new Cross(100), new Wall(10), new Water(5)};
        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                o.doIt(p);
                if (!p.isOnDistance()) {
                    break;
                }
            }
        }
        System.out.println("RESULT:");
        for (Participant p : participants) {
            p.info();
        }
//        Team team = new Team("Rocket", new Cat("Barsik"), new Dog("Bobik"), new Human("Bob"), new Human("test1"), new Human("test2"), new Human("test3"), new Human("test4"));
//        Course course = new Course(new Cross(100), new Wall(10), new Water(5));
//        course.doIt(team);
//        team.info();
    }
}