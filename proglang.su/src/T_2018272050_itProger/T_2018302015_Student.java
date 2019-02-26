package T_2018272050_itProger;

public class T_2018302015_Student extends T_2018301844_02_Person {
    int course = 1;

    public T_2018302015_Student(int height, String name, int course) {
        super(height, name);
        this.course = course;
    }

    void tell() {
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }
}