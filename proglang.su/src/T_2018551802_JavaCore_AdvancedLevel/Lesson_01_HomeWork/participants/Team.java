package T_2018551802_JavaCore_AdvancedLevel.Lesson_01_HomeWork.participants;

import Lesson_01_HomeWork.participants.Participant;

public class Team {
    private String title;
    private Participant[] participants;

    public Participant[] getParticipants() {
        return participants;
    }

    public Team(String title, Participant... participants) {
        this.title = title;
        this.participants = participants;
    }

    public void info() {
        System.out.println(title);
        for (Participant o : participants) {
            o.info();
        }
    }
}