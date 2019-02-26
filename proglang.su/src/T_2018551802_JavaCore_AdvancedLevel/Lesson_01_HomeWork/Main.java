package T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork;

import Lesson_01_HomeWork.obstacles.*;
import Lesson_01_HomeWork.participants.*;
import T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork.obstacles.Course;
import T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork.participants.Team;

public class Main {

    public static void main(String[] args) {
        //Случайная генерация участников
        Participant[] p = new Participant[4];
        for (int i = 0; i < p.length; i++) {
            int x = (int) (Math.random() * 3);
            if (x == 0) {
                p[i] = new Cat("Barsik " + i);
            } else if (x == 1) {
                p[i] = new Dog("Bobik " + i);
            } else if (x == 2) {
                p[i] = new Human("Bob " + i);
            }
        }
//        Team team = new Team("Rocket", p);

        Team team = new Team("Rocket", new Cat("Barsik"), new Dog("Bobik"), new Human("Bob"), new Human("test1"));
        Course course = new Course(new Cross(100), new Wall(10), new Water(5));
        course.doIt(team);
        team.info();
    }
}