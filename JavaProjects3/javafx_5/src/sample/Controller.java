package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button buttonMerhaba;

    @FXML
    private Button buttonHoscakal;


    @FXML
    void selectedMerhaba(ActionEvent event) {
        System.out.println("Merhaba Erdem");
    }

    @FXML
    void selectedHoscakal(ActionEvent event) {
        System.out.println("Hoscakal Erdem");
    }

}
