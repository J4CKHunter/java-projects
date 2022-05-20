package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static javafx.application.Platform.runLater;


public class Controller {

    @FXML
    private TextField textFieldAd;

    @FXML
    private Button buttonMerhaba;

    @FXML
    private Button buttonHoscakal;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Label info;

    @FXML
    public void initialize(){
        buttonMerhaba.setDisable(true);
        buttonHoscakal.setDisable(true);
    }

    @FXML
    public void buttonClick(ActionEvent event){

        if(event.getSource().equals(buttonMerhaba)){
            System.out.println("Merhaba " + textFieldAd.getText() + " !");
        }

        else if(event.getSource().equals(buttonHoscakal)){
            System.out.println("Hoscakal " + textFieldAd.getText() + " !");
        }

        Runnable longTermProcess = new Runnable() {
            @Override
            public void run() {

                try {

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            info.setText("İş yapılmaya başlanıyor.");
                        }
                    });

                    Thread.sleep(5000);

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            info.setText("İş tamamlandı.");
                        }
                    });

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }




        };

        new Thread(longTermProcess).start();


        if(checkBox.isSelected()){
            textFieldAd.clear();
            buttonMerhaba.setDisable(true);
            buttonHoscakal.setDisable(true);
        }
    }

    @FXML
    public void checkTextField(){

        String str = textFieldAd.getText();
        boolean buttonDisabler = str.isEmpty() || str.trim().isEmpty(); // str.isEmpty() gerekli değil gibi duruyor.
        buttonMerhaba.setDisable(buttonDisabler);
        buttonHoscakal.setDisable(buttonDisabler);

    }

}
