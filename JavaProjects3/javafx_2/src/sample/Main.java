package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("hbox.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("vbox.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("borderpane.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("flowpane.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("tilepane.fxml"));

        primaryStage.setTitle("javafx_2");
        primaryStage.setScene(new Scene(root, 500, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
