package T_2018551802_JavaCore_AdvancedLevel.Lesson_01;


import T_2018551802_JavaCore_AdvancedLevel.Lesson_01.obstacles.*;
import T_2018551802_JavaCore_AdvancedLevel.Lesson_01.participants.*;

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