package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Launcher extends Application {
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/mainForm.fxml"))));
        stage.setTitle("Main Form");

        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
