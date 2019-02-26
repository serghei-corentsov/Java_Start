package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class Controller {

    private CollectionTableView adressBookImpl = new CollectionTableView();

    @FXML
    private TableView tableAddressBook;
    @FXML
    private TableColumn<Person, String> columnFIO;
    @FXML
    private TableColumn<Person, String> columnPhone;
    @FXML
    private Button addButton;

    @FXML
    private void initialize(){
        columnFIO.setCellValueFactory(new PropertyValueFactory<Person, String>("fio"));
        columnPhone.setCellValueFactory(new PropertyValueFactory<Person, String>("phone"));
    }

    public void actionButtonPressed(ActionEvent actionEvent) {
        adressBookImpl.fillTestData(); // добавляем данные в колекцию
        tableAddressBook.setItems(adressBookImpl.getPersonList()); // v.1 загружаем данные в таблицу
//        tableAddressBook.setItems(adressBookImpl.personList); // v.2
    }

    public void idActionDrag(MouseEvent mouseEvent) {
        addButton.setText("Кнопку не возможно сдвинуть");
    }
}
