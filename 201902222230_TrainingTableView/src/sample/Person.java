package sample;

import javafx.beans.property.SimpleStringProperty;

public class Person {

    public Person(){
    }
    public Person(String fio, String phone){
        this.fio = new SimpleStringProperty(fio);
        this.phone = new SimpleStringProperty(phone);
    }

    private SimpleStringProperty phone = new SimpleStringProperty("");
    private SimpleStringProperty fio = new SimpleStringProperty("");

    public SimpleStringProperty fioProperty(){
        return fio;
    }
    public SimpleStringProperty phoneProperty(){
        return phone;
    }
}
