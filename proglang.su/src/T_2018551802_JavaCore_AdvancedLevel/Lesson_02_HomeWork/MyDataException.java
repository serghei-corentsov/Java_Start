package T_2018551802_JavaCore_AdvancedLevel.Lesson_02_HomeWork;

public class MyDataException extends MyException {
    private int col;
    private int row;

    public MyDataException(int col, int row) {
        super("Incorrect data in " + "столбец " + col + ": ряд " + row);
        this.col = col;
        this.row = row;
    }
}