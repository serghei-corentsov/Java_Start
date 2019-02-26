package T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork.participants;

public interface Participant {
    void run(int distance);
    void jump(int height);
    void swim(int distance);
    boolean isOnDistance();
    void info();
}