package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CollectionTableView {

    private ObservableList<Person> personList = FXCollections.observableArrayList(); // v.1 почему приват?
//    public ObservableList<Person> personList = FXCollections.observableArrayList(); // v.2

    public ObservableList<Person> getPersonList(){
        return personList;
    } // v.1

    public void fillTestData(){
        personList.add(new Person("Абрамов Иван Сергеевич", "+7-123-456-78-99"));
        personList.add(new Person("Яковлев Глеб Семенович", "+7-234-456-89-11"));
        personList.add(new Person("Фомин Александр Игоревич", "+7-987-258-67-24"));
        personList.add(new Person("Иванов Станислав Михайлович", "+7-753-951-57-61"));
    }
}
